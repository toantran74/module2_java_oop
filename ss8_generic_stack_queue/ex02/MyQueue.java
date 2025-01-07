package ss8_generic_stack_queue.ex02;

import ss8_generic_stack_queue.MyStack;

public class MyQueue<E> {
    public class Node<E> {
        private E data;
        private Node next;
        public Node(E data) {
            this.data = data;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    // them
    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        }
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    // lay ra xem
    public E peek() {
        if (head == null) {
            return null;
        }
        return tail.data;
    }
    // lay ra xem va xoa
    public E pop() {
        if (head == null) {
            return null;
        }
        Node<E> temp = head;
        if(size == 1) {
            head = null;
            tail = null;
        }
        else {
            for(int i = 2; i < size - 1; i++) {
                temp = temp.next;
            }

            tail = temp;
            temp = temp.next;
            tail.next = null;
        }
        size--;
        return temp.data;
    }
    // kiem tra rong
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node temp = head;
        for(int i = 0; i < size; i++) {
            str.append(temp.data + "\t");
            temp = temp.next;
        }
        return str.toString();
    }
}
