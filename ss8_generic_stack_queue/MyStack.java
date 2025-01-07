package ss8_generic_stack_queue;

import ss7_dsa_list.ex01myarraylist.ex02mylinkedlist.MyLinkedList;

import java.util.Stack;

public class MyStack<E> {
   private class Node {
       private E value;
       private Node next;
       public Node(E value) {
           this.value = value;
       }
   }
   private Node head;
   private Node tail;
   private int size;

    public void push(E value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public E peek() {
        if(head == null) {
            return null;
        }
        return head.value;
    }
    public E pop() {
        if(head == null) {
            return null;
        }
        Node temp = head;
        if(size == 1) {
            head = null;
            tail = null;
        }
        else {
            head = head.next;
        }
        size--;
        return temp.value;
    }
    // kiem tra rong
    public boolean isEmpty() {
        return size == 0;
    }
    // tra ve so luong phan tu
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node temp = head;
        for(int i = 0; i < size; i++) {
            str.append(temp.value);
            temp = temp.next;
        }
        return str.toString();
    }
}
