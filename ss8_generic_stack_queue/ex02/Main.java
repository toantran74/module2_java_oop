package ss8_generic_stack_queue.ex02;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(16);
        myQueue.add(8);
        myQueue.add(4);
        myQueue.add(2);
        System.out.println(myQueue);
    }
}
