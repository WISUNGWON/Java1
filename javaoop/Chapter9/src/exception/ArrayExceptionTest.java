package exception;

public class ArrayExceptionTest {

    public static void main(String[] args) {
        
        
        int[] arr = new int[5];
        
        /* 예외 처리를 하면, 프로그램이 죽지않고
         * 예외 부분만 지시한대로 남긴뒤 끝까지 프로그램을 실행함.
         * 
         */
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("exception");
        }
        System.out.println("log off");

    }

}
