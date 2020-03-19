package collection;

import java.util.ArrayList;

class MyStack<T> {
    
    private ArrayList<T> arrayStack = new ArrayList<T>();
    
    public void push(T data) {
        arrayStack.add(data);
    }
    
    public T pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("Stack is empty");
            return null;
        }
        return arrayStack.remove(len-1);
    }
}
public class StackTest {

    public static void main(String[] args) {
        
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        


    }

}
