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
        Sort.super.description(); //Sort를 붙이는 이유는, description의 예약어가 Sort와 다르기 때문에, Sort의 메서드라는 것을 명시해야한다.
        //쉽게 이해해서 implements한 객체는 인터페이스 객체의 default 메서드를 (인터페이스 타입.super.메서드이름) 으로 사용할 수 있다라고 알아두자 
        System.out.println("BubbleSort 입니다");
    }

}
