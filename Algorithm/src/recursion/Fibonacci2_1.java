package recursion;

import java.util.Scanner;

public class Fibonacci2_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //테스트 케이스의 개수
		int[][] f = new int[41][2];
		f[0][0] = 1;
		f[1][1] = 1;
		for (int i = 2; i <41; i++) {
			for(int j = 0; j < 2; j++) {
				f[i][j] = f[i-1][j] + f[i -2][j];
			}
		}
		
		for(int i = 0; i < num; i++) {
			int a = sc.nextInt(); //테스트 하고 싶은 n번째 수 
			System.out.println(f[a][0]+" " +f[a][1]);
		}
		
		sc.close();
	}
}
