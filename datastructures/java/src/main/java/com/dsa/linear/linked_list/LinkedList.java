package com.dsa.linear.linked_list;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Integer len;

    public LinkedList() {
        this.len = 0;
    }

    public Node<T> append(T data) {
        var newNode = new Node<>(data);
        if (head == null) {
            tail = newNode;
            head = tail;
        } else if (head == tail) {
            tail = newNode;
            head.next = tail;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        len++;
        return tail;
    }

    @Override
    public String toString() {
        Node<T> current = head;

        var sb = new StringBuilder();

        sb.append("[");

        while (current != null) {
            sb.append(current);

            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public Integer len() {
        return this.len;
    }

    public void reversed(){
        Node<T> current = head, prev = null, next;

        while (current.next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        current.next = prev;
        tail= head;
        head = current;
    }
}
