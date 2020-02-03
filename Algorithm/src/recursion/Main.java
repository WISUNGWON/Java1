package recursion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
			Scanner id = new Scanner(System.in);
			
			int score = id.nextInt();
			
			if (score>=90)
				System.out.println("A");
			if (score>=80 && score<=89)
				System.out.println("B");
			if (score>=70 && score<=79)
				System.out.println("C");
			if (score>=60 && score<=69)
				System.out.println("D");
			else
				System.out.println("F");

	}
}
