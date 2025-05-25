package com.dsa.linear.linked_list;

public class Node<T> {
    Node<T> next;
    T data;

    public Node(T data) {
        this.data = data;
    }

    public boolean append(T data) {
        this.next = new Node<>(data);
        return true;
    }


    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
