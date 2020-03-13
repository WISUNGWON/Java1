package classpart;

public class FunctionTest {
	
	public static int addNum (int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	// 반환값이 없는 메서드
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 매개변수가 없는 메서드
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		// 함수는 호출을 해야 사용할 수 있음
		
		int total = addNum(n1, n2);
		//String hello = sayHello("Hello"); sayHello는 반환값이 없는 함수이기 때문에 변수로 값을 받을 수 없음.
		int num = calcSum();
		
		sayHello("Hello");
		System.out.println(total);
		System.out.println(num);
		
	}

}
