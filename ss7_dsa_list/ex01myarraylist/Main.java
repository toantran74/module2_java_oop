package ss7_dsa_list.ex01myarraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        // a. them phan tu element vao cuoi
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        //b. tra ve thong tin doi tuong
        System.out.println(list.toString());
        // c. them phan tu vao vi tri index
        list.add(2, 98);
        System.out.println(list.toString());
        //d. thay the phan tu
        list.set(0, 2505);
        System.out.println(list.toString());
        //e. tra ve phan tu tai vi tri insex
        int element = list.get(1);
        System.out.println(element);
        // f. lay vi tri index phan tu dau tien duoc tim thay
        int elementFind = 40;
        int result = list.indexOf(elementFind);
        //System.out.println(result);
        if(result != -1){
            System.out.println(result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
