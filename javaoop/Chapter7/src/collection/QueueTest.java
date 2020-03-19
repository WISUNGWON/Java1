package collection;

import java.util.ArrayList;

class MyQueue {
    
    private ArrayList<String> arrayQueue = new ArrayList<String>();
    
    public String dequeue() {
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayQueue.remove(0);
    }
    
    public void inqueue (String data) {
            arrayQueue.add(data);
        }
    
    public String toString() {
       String print = "[";
       for (int i = 0; i < arrayQueue.size(); i++) {
           print = print + arrayQueue.get(i);
           if (i != arrayQueue.size() - 1) {
               print += ", ";
           }
           else {
               print += "]";
           }
       }
       
       if (arrayQueue.size() == 0) {
           return null;
       }
       
       return print;
    }
}
    

public class QueueTest {
    
    public static void main(String[] args) {
        
        MyQueue queue = new MyQueue();
        queue.inqueue("A");
        queue.inqueue("B");
        queue.inqueue("C");
        queue.inqueue("D");
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }

}