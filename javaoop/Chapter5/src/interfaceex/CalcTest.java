package interfaceex;

public class CalcTest {

    public static void main(String[] args) {
        
        Calc calc = new CompleteCalc();
        int n1 = 10;
        int n2 = 2;
        
        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
        
       // calc.showInfo();
        calc.description(); //인터페이스의 type으로 선언(인스턴스의 생성과 상관없이 사용가능)
        int[] arr = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);
        System.out.println(sum);
        
        CompleteCalc calc2 = new CompleteCalc();
        Calc.total(arr);
        //static으로 선언된 변수나 메서드는 오버라이드 할 수 없다. 클래스에 소속되어 있는 변수이기 때문에.
        // 인스턴스는 메서드를 정의하지 않은 코드들이 남아 있기 때문에 인스턴스화 할 수 없다. 따라서 타입만 참고할 수 있다.
        
        calc.test();
  

    }

}
