package ss7_dsa_list.ex01myarraylist.ex02mylinkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.add(3,70);
        list.removeFirst();

        System.out.println(list);
    }
}
