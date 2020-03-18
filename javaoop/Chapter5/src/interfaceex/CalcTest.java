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

    }

}
