#pragma once
#include <iostream>
#include <memory>

template<typename T>
class BinaryTree {
private:
    struct Node {
        T data;
        std::unique_ptr<Node> left;
        std::unique_ptr<Node> right;
        Node(T value) : data(value) {}
    };
    
    std::unique_ptr<Node> root;
    size_t size_ = 0;

public:
    BinaryTree() = default;
    ~BinaryTree() = default;

    void insert(const T& value);
    bool contains(const T& value);
    void inorder_traversal() const;
    void inorder_helper(Node* node) const;
    bool empty() const;
    size_t size() const;
};

template<typename T>
void BinaryTree<T>::insert(const T& value) {
    if (!root) {
        root = std::make_unique<Node>(value);
        ++size_;
        return;
    }
    
    Node* current = root.get();
    while (true) {
        if (value < current->data) {
            if (!current->left) {
                current->left = std::make_unique<Node>(value);
                ++size_;
                break;
            }
            current = current->left.get();
        } else {
            if (!current->right) {
                current->right = std::make_unique<Node>(value);
                ++size_;
                break;
            }
            current = current->right.get();
        }
    }
}

template<typename T>
bool BinaryTree<T>::contains(const T& value) {
    Node* current = root.get();
    while (current) {
        if (value == current->data) {
            return true;
        }
        if (value < current->data) {
            current = current->left.get();
        } else {
            current = current->right.get();
        }
    }
    return false;
}

template<typename T>
void BinaryTree<T>::inorder_traversal() const {
    inorder_helper(root.get());
    std::cout << std::endl;
}

template<typename T>
void BinaryTree<T>::inorder_helper(Node* node) const {
    if (!node) return;
    
    inorder_helper(node->left.get());
    std::cout << node->data << " ";
    inorder_helper(node->right.get());
}

template<typename T>
bool BinaryTree<T>::empty() const {
    return root == nullptr;
}

template<typename T>
size_t BinaryTree<T>::size() const {
    return size_;
}
