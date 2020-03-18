package chapter5;

public class BubbleSort implements Sort {

    @Override
    public void ascedning(int[] arr) {
        System.out.println("BubbleSort ascending");
        
    }

    @Override
    public void descending(int[] arr) {
     System.out.println("BubbleSort descending");
        
    }
    
    public void description() {
        Sort.super.description();
        System.out.println("BubbleSort 입니다");
    }

}
