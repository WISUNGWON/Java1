package lambda;

public class TestMyNumber {
    
    public static void main(String[] args) {
        
        //2)메서드 구현
        MyMaxNumber max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMaxNumber(10, 20));
        
        /*
         * x, y라는 2개의 매개변수가 넘어올 건데,
         * MyMaxNumber인터페이스에 있는 메서드가 넘어 오면
         */
    }

}
