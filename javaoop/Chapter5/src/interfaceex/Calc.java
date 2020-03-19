package interfaceex;

public interface Calc {
    
    double PI = 3.14; //컴파일 단계에서 public static final이 붙음
    int ERROR = -999999999;
    
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    
    //인터페이스를 받는 모든 객체들이 사용할 수 있도록 기본 구현을 갖고있으며, implements한 객체들이 재정의하여 사용할 수 있음.
    //추상클래스의 구현메서드처럼 기본적인 구현을 갖고 있는 메서드. java7까지는 이 기능이 없었음. 
    default void description() {
        System.out.println("정수 계산기를 구현합니다");
        //myMethod();
    }
    
    //인스턴스 생성과 상관없이 사용가능.
    public static int total(int[] arr) {
        int total = 0;
        
        for (int i : arr) {
            total += i;
        }
        //mystaticMethod();
        return total;
    }
    
    default void test() {
        System.out.println("이건 디폴트값");
    }
    
    //java 9이상에서만 사용 가능 
//    private void myMethod() {
//        System.out.println("private method");
//    }
    
//    private static void mystaticMethod() {
//        System.out.println("private static method");
//    }

}
