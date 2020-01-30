// ���� 1003���� Ǯ��1

package recursion;

import java.util.Scanner;
public class Fibonacci2 {
	
	static int zero;
	static int one;
	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		
	
		int t = id.nextInt(); // �׽�Ʈ ���̽��� ����
		int[] arr = new int[t*2];
		
		for(int i=0; i<t; i++) {
			zero = 0;
			one = 0;
			int a = id.nextInt();
			
	
			fibonacci(a);
			
			//0��1�� ������ �����ֱ� ���� ���������� �迭�� ��� ���
			arr[i*2] = zero;
			arr[i*2+1] = one;
			}
		
		//�׽�Ʈ ���̽� ù�� ° ���� ���������� ���
		for(int i=0; i<t; i++)
			System.out.println(arr[i*2]+" "+arr[i*2+1]);
		id.close();
		
	}
	
	static int fibonacci(int n) {
		if(n == 0) {
			zero++;
			return 0;
		} else if(n == 1) {
			one++;
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

}

// �Ǻ���ġ �Լ��� ��������(zero, one)�� �����ϰ� 1�� 0�� �� ������ 1�� ����
// �׽�Ʈ ���̽�*2��ŭ�� �迭�� ���� �ش� �迭�� ��Ҹ� �� ���� ���������� ���� ���
