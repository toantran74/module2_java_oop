package ss7_dsa_list.ex01myarraylist.ex02mylinkedlist;

public class MyLinkedList {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    //a. them vao dau
    public void addFirst(int element) {
        Node newNode = new Node(element);
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
    //b. them vao cuoi
    public void addLast(int element) {
        //Node newNode = new Node(element);
        if(head == null) {
            addFirst(element);
        }
        else {
            Node newNode = new Node(element);
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    public void add(int index, int element) {
       if(index < 0 || index > size) {
           System.out.println("Invalid index");
       }
       else if(index == 0){
           addFirst(element);
       }
       else if(index == size) {
           addLast(element);
       }
       else {
           Node temp = head;
           for(int i = 1; i < index; i++) {
               temp = temp.next;
           }
           Node newNode = new Node(element);
           newNode.next = temp.next;
           temp.next = newNode;
           size++;
       }
    }
    public void removeFirst() {
        if(head == null) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = null;
            tail = null;

        } else {
            head = head.next;
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node current = head;
        for(int i = 0; i < size; i++) {
            str.append(current.data + " ");
            current = current.next;
        }
        return str.toString();
    }
    //d. xoa cuoi
    public Integer removeLast() {
        if(head == null) {
           return null;
        }
        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;

        } else {
            for(int i = 2; i < size; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp = temp.next;
            tail.next = null;
        }
        size--;
        return temp.data;
    }

}
