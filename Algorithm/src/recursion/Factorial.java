package recursion;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		int input = id.nextInt();
		System.out.println(fact(input));
	}
	
	public static int fact(int n) {
		
		if (n == 0)
			return 1;
		else if (n <= 1)
			return n;
		else
			return fact(n-1)*n;
	}
}

/* ����
 * 1) ó�� fact �޼ҵ尡 �Ҹ� ���� main �Լ������̴�.
 * fact(4) ����
 * 
 * 2) fact(4)
 * n�� ����4
 * n�� 1���� ũ�Ƿ� else�� Ÿ��,
 * fact(3)�� ȣ��
 * 
 * 3) ���⼭ ó�� ȣ��� fact(4)�� ������� �ʰ� Stack�� ���λ��·�,
 * fact(4)�� ȣ���� fact(3)�� ����ȴ�.
 * 
 * Stack
 * [fact(4)]
 * 
 * 4) fact(3)
 * n�� ����3
 * n�� 1���� ũ�Ƿ� else�� Ÿ��,
 * fact(2)ȣ��
 * 
 * Stack
 * [fact(3)]
 * [fact(4)]
 * 
 * 5) fact(2)
 * n�� ���� 2
 * n�� 1���� ũ�Ƿ� else�� ����,
 * fact(1) ȣ��
 * 
 * Stack
 * [fact(2)]
 * [fact(3)]
 * [fact(4)]
 * 
 * 7) fact(1)
 * n�� ���� 1
 * n�� 1�� �����Ƿ� if���� Ÿ��, n ��, 1�� return
 * 
 * 8) fact(1)�� ����Ǹ鼭, Stack�� ���� ���� �ִ� fact(2)���� ���ʴ�� �����Ű�� ����� ����
 * ��������� 4! 1x2x3x4�� �ϰԵ� ��.
 */
