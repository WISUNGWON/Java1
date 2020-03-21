package innerclass;

class Outer {
    
    int outNum = 100;
    static int sNum = 200;
    
    Runnable getRunnable(int i) {
        
        int num = 100;
        //지역 내부 클래스
        class MyRunnable implements Runnable {

            
            public void run() {
                
//               num += 10; 상수(final)로 선언되기 때문에 참조는 할 수 있지만 변경은 할 수 없음
//               i = 200;
                
              System.out.println(i);
              System.out.println(num);
              System.out.println(outNum);
              System.out.println(Outer.sNum);
                
            }
            
        }
        
        return new MyRunnable();
    }
}

public class LocalInnerClassTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);
        
        runnable.run();

    }

}
