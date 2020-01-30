package recursion;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		int input = id.nextInt();
		
		
		//�Է� ���� ���� ������ŭ �Ǻ���ġ ���� ���.
		for(int i = 1; i <= input; i++){
			System.out.print(fibo(i) +" ");
		}

	}
	
	//�Է� ���� ������ ��ġ�� �ش��ϴ� �Ǻ���ġ ���� ��ȯ
	public static int fibo(int n) {
		if (n <= 1)
			return n;
		else
			return fibo(n-2) + fibo(n-1);
		
	}

}


/*����Լ��� �Լ� ������ ������ ����, ����ϸ鼭 ���� �ö󰡸� ����ģ��.
 * 
 * */
