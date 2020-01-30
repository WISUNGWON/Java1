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

/* 원리
 * 1) 처음 fact 메소드가 불린 것은 main 함수에서이다.
 * fact(4) 실행
 * 
 * 2) fact(4)
 * n은 현재4
 * n은 1보다 크므로 else를 타고,
 * fact(3)이 호출
 * 
 * 3) 여기서 처음 호출된 fact(4)는 종료되지 않고 Stack에 쌓인상태로,
 * fact(4)가 호출한 fact(3)이 실행된다.
 * 
 * Stack
 * [fact(4)]
 * 
 * 4) fact(3)
 * n은 현재3
 * n은 1보다 크므로 else를 타고,
 * fact(2)호출
 * 
 * Stack
 * [fact(3)]
 * [fact(4)]
 * 
 * 5) fact(2)
 * n은 현재 2
 * n은 1보다 크므로 else를 ㅏ고,
 * fact(1) 호출
 * 
 * Stack
 * [fact(2)]
 * [fact(3)]
 * [fact(4)]
 * 
 * 7) fact(1)
 * n은 현재 1
 * n이 1과 같으므로 if문을 타고, n 즉, 1을 return
 * 
 * 8) fact(1)이 종료되면서, Stack의 가장 위에 있는 fact(2)부터 차례대로 실행시키며 결과값 도출
 * 결과적으로 4! 1x2x3x4를 하게된 것.
 */
