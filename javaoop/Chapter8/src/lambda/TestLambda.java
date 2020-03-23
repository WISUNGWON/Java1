package lambda;

@FunctionalInterface
interface PrintString {
    void showString(String str);
    
}

public class TestLambda {

    public static void main(String[] args) {
        
        //함수의 구현부가 lambdaStr라는 변수에 대입됨.
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("Test");
        
        showMyString(lambdaStr);
        
        PrintString test = returnString();
        test.showString("Test3");

    }
    
    
    //함수의 구현부를 매개변수로 사용.
    public static void showMyString(PrintString p) {
        p.showString("Test2");
        
    }
    
    //함수의 구현부가 변수처럼 return됨.
    public static PrintString returnString() {
        return s -> System.out.println(s + "!!!");
    }

}
