package classpart;

public class FunctionTest {
	
	public static int addNum (int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	// ��ȯ���� ���� �޼���
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// �Ű������� ���� �޼���
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
		// �Լ��� ȣ���� �ؾ� ����� �� ����
		
		int total = addNum(n1, n2);
		//String hello = sayHello("Hello"); sayHello�� ��ȯ���� ���� �Լ��̱� ������ ������ ���� ���� �� ����.
		int num = calcSum();
		
		sayHello("Hello");
		System.out.println(total);
		System.out.println(num);
		
	}

}
