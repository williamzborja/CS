#pragma once
#include <iostream>
#include <memory>

template<typename T>
class LinkedList {
private:
    struct Node {
        T data;
        std::unique_ptr<Node> next;
        Node(T value) : data(value) {}
    };
    
    std::unique_ptr<Node> head;
    size_t size_ = 0;

public:
    LinkedList() = default;
    ~LinkedList() = default;

    void push_front(const T& value);
    void push_back(const T& value);
    void pop_front();
    bool empty() const;
    size_t size() const;
    void print() const;
};

template<typename T>
void LinkedList<T>::push_front(const T& value) {
    auto new_node = std::make_unique<Node>(value);
    new_node->next = std::move(head);
    head = std::move(new_node);
    ++size_;
}

template<typename T>
void LinkedList<T>::push_back(const T& value) {
    auto new_node = std::make_unique<Node>(value);
    if (empty()) {
        head = std::move(new_node);
    } else {
        Node* current = head.get();
        while (current->next) {
            current = current->next.get();
        }
        current->next = std::move(new_node);
    }
    ++size_;
}

template<typename T>
void LinkedList<T>::pop_front() {
    if (!empty()) {
        head = std::move(head->next);
        --size_;
    }
}

template<typename T>
bool LinkedList<T>::empty() const {
    return head == nullptr;
}

template<typename T>
size_t LinkedList<T>::size() const {
    return size_;
}

template<typename T>
void LinkedList<T>::print() const {
    Node* current = head.get();
    while (current) {
        std::cout << current->data << " ";
        current = current->next.get();
    }
    std::cout << '\n';
}
