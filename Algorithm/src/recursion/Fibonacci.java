package recursion;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		int input = id.nextInt();
		
		
		//입력 받은 숫자 개수만큼 피보나치 수열 출력.
		for(int i = 1; i <= input; i++){
			System.out.print(fibo(i) +" ");
		}

	}
	
	//입력 받은 숫자의 위치에 해당하는 피보나치 수열 반환
	public static int fibo(int n) {
		if (n <= 1)
			return n;
		else
			return fibo(n-2) + fibo(n-1);
		
	}

}


/*재귀함수는 함수 수행이 끝나고 부터, 계산하면서 위로 올라가며 끝마친다.
 * 
 * */
