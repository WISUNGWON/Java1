package innerclass;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;
    
    public OutClass(){
        inClass = new InClass(); 
    }
    
    //인스턴스 내부 클래스 (보통 private로 선언한다)
    class InClass{
        int iNum = 100;
        
        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }
        /* static int sInNum = 200;
         * 인스턴스 내부 클래스는 클래스 생성 이후에 class의 맴버를 사용할 수 있기 때문에
         * 언제나 사용 가능한 static 변수를 선언할 수 없다. 
         */       
         
    }
    
    public void usingInner() {
        inClass.inTest();
    }
    
    //정적 내부 클래스
    static class InstaticClass{
        int inNum = 100;
        static int sInNum = 200;
        
        void inTest() {
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }
        
        static void sTest() {
//          System.out.println(inNum); static 메서드에서는 인스턴스 변수인 inNum은 사용할 수 없다.
            System.out.println(sInNum);
            System.out.println(sNum);
            
        }
    }
    
    
}

public class InnerTest {

    public static void main(String[] args) {
        
        //OutClass 생성과 동시에 inClass도 생성됨.
        OutClass outClass = new OutClass();
        outClass.usingInner();
       
       
        //InClass는 인스턴스 클래스이기 때문에 OutClass. 으로 불러와야 한다.
        //외부 클래스는 언제나 static이기 때문에 OutClass처럼 불러올 수 있다.
        OutClass.InClass myInClass = outClass.new InClass();
        myInClass.inTest();
        
        System.out.println();
        
        OutClass.InstaticClass sInClass = new OutClass.InstaticClass();
        
        OutClass.InstaticClass.sTest();
        sInClass.inTest();
        
    
    
    }

}
