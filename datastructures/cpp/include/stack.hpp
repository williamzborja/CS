#pragma once
#include <iostream>
#include <memory>

template<typename T>
class Stack {
private:
    struct Node {
        T data;
        std::unique_ptr<Node> next;
        Node(T value) : data(value) {}
    };
    
    std::unique_ptr<Node> top_;
    size_t size_ = 0;

public:
    Stack() = default;
    ~Stack() = default;

    void push(const T& value);
    void pop();
    T& top();
    bool empty() const;
    size_t size() const;
};

template<typename T>
void Stack<T>::push(const T& value) {
    auto new_node = std::make_unique<Node>(value);
    new_node->next = std::move(top_);
    top_ = std::move(new_node);
    ++size_;
}

template<typename T>
void Stack<T>::pop() {
    if (!empty()) {
        top_ = std::move(top_->next);
        --size_;
    }
}

template<typename T>
T& Stack<T>::top() {
    if (empty()) {
        throw std::runtime_error("Stack is empty");
    }
    return top_->data;
}

template<typename T>
bool Stack<T>::empty() const {
    return top_ == nullptr;
}

template<typename T>
size_t Stack<T>::size() const {
    return size_;
}
