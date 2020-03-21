package innerclass;

class Outer2 {
    
    int outNum = 100;
    static int sNum = 200;
    
    Runnable getRunnable(int i) {
        
        int num = 100;
        //익명 이너 클래스
        return new Runnable(){

            
            public void run() {
                
//               num += 10; 상수(final)로 선언되기 때문에 참조는 할 수 있지만 변경은 할 수 없음
//               i = 200;
                
              System.out.println(i);
              System.out.println(num);
              System.out.println(outNum);
              System.out.println(Outer.sNum);
                
            }
            
        };
        
       
    }
    
    //익명 이너 클래스 2
    //인스턴스 생성과 정의를 같이함.
    Runnable runner = new Runnable() {
        
        @Override
        public void run() {
            System.out.println("test");
            
        }
    };
}

public class AnonymousInnerClassTest {

    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.runner.run(); //인스턴스지만 클래스 내부에서 생성되기 때문에 바로 사용할 수 있다.
        
        Runnable runnable = outer.getRunnable(50);
        
        runnable.run();
        
        

    }

}
