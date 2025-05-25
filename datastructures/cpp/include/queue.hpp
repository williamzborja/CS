#pragma once
#include <iostream>
#include <memory>

template<typename T>
class Queue {
private:
    struct Node {
        T data;
        std::unique_ptr<Node> next;
        Node(T value) : data(value) {}
    };
    
    std::unique_ptr<Node> front_;
    Node* back_ = nullptr;
    size_t size_ = 0;

public:
    Queue() = default;
    ~Queue() = default;

    void enqueue(const T& value);
    void dequeue();
    T& front();
    bool empty() const;
    size_t size() const;
};

template<typename T>
void Queue<T>::enqueue(const T& value) {
    auto new_node = std::make_unique<Node>(value);
    if (empty()) {
        front_ = std::move(new_node);
        back_ = front_.get();
    } else {
        back_->next = std::move(new_node);
        back_ = back_->next.get();
    }
    ++size_;
}

template<typename T>
void Queue<T>::dequeue() {
    if (!empty()) {
        front_ = std::move(front_->next);
        if (front_) {
            back_ = front_.get();
            while (back_->next) {
                back_ = back_->next.get();
            }
        } else {
            back_ = nullptr;
        }
        --size_;
    }
}

template<typename T>
T& Queue<T>::front() {
    if (empty()) {
        throw std::runtime_error("Queue is empty");
    }
    return front_->data;
}

template<typename T>
bool Queue<T>::empty() const {
    return front_ == nullptr;
}

template<typename T>
size_t Queue<T>::size() const {
    return size_;
}
