package ss7_dsa_list.ex01myarraylist;

import java.util.Arrays;

public class MyArrayList {
    private int capacity;
    private int[] array;
    private int size;
    private int[] emptyArray;

    public int size(){
        return size;
    }

    public MyArrayList(){
        array = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
    }
    // a. Them 1 element vao cuoi
    public void add(int element) {
        if(array == emptyArray){
            this.capacity = 10;
            this.array = new int[this.capacity];
        }
        if(size == capacity){
            this.capacity *= 1.5;
            if(size == capacity){
                capacity ++;
            }
            // tao 1 mang moi
            int[] brr = new int[capacity];
            // copy
            for(int i = 0; i < capacity; i++){
                brr[i] = array[i];
            }
            array = brr;
        }
        array[size] = element;
        size++;
    }
    //b. Tra ve thong tin doi tuong

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < size; i++){
            str.append(array[i]).append("\t");
        }
        return str.toString();
    }

    //c. them phtu vao vi tri index
    public void add(int index, int element) {
        // kiem tra index co hop le hay ko?
        if(index < 0 || index > size){
            System.out.println("Invalid index");
            return;
        }
        if(size == capacity){
            this.capacity *= 1.5;
            if(size == capacity){
                capacity ++;
            }
            int[] brr = new int[capacity];

            // sao chep phtu arr sang brr cho den vi tri index
            for(int i = 0; i < index; i++){
                brr[i] = array[i];
            }
            brr[index] = element;

            // sao chep phtu arr sang brr sau vi tri index
            for(int i = index; i < size; i++){
                brr[i + 1] = array[i];
            }
            array = brr;
        }
        else {
            for(int i  = size; i > index; i--){
                array[i] = array[i - 1];
            }
            array[index] = element;
        }
        size++;
    }
    //d. thay the phtu tai vi tri index
    public void set(int index, int element) {
        if(index < 0 || index > size){
            System.out.println("Invalid index");
            return;
        }
        // gan gia tri moi vao index cu the
        array[index] = element;
    }
    //e. Tra ve phan tu hien tai tai vi tri index
    public Integer get(int index){
        if(index < 0 || index > size){
            System.out.println("Invalid index");
            return null;
        }
        return array[index];
    }
    //f. tim vi tri index(dau tien)
    public int indexOf(int element){
        for(int i = 0; i < size; i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }
    //g. tim vi tri index(cuoi cung)
    public int lastIndexOf(int element){
        for(int i = size - 1; i >= 0; i--){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }
    //h, xoa
    public void remove(int index){
        if(index < 0 || index > size){
            System.out.println("Invalid index");
            return;
        }
        // dich chuyen cac phtu trc index sang trai
        for(int i = index; i < size - 1; i++){
            array[i] = array[i + 1];
        }
        size--;
    }
    //i. xoa all
    public void removeAll(int element){
        int index = 0;
        for(int i = 0; i < size; i++){
            if(array[i] != element){
                array[index] = array[i];
                index++;
            }
        }
        size = index;
    }
}
