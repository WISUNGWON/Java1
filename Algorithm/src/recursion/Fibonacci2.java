// 백준 1003문제 풀이1

package recursion;

import java.util.Scanner;
public class Fibonacci2 {
	
	static int zero;
	static int one;
	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		
	
		int t = id.nextInt(); // 테스트 케이스의 개수
		int[] arr = new int[t*2];
		
		for(int i=0; i<t; i++) {
			zero = 0;
			one = 0;
			int a = id.nextInt();
			
	
			fibonacci(a);
			
			//0과1의 갯수를 보여주기 위해 순차적으로 배열에 요소 담기
			arr[i*2] = zero;
			arr[i*2+1] = one;
			}
		
		//테스트 케이스 첫번 째 부터 순차적으로 출력
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

// 피보나치 함수에 전역변수(zero, one)을 설정하고 1과 0이 될 때마다 1씩 증가
// 테스트 케이스*2만큼의 배열을 만들어서 해당 배열의 요소를 두 개씩 순차적으로 꺼내 출력
