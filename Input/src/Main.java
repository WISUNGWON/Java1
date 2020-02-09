
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
    	
    	Scanner s = new Scanner(System.in);
    	
    	while(s.hasNextInt()) {
    		int a = s.nextInt();
    		int b = s.nextInt();
    		
    		System.out.println(a+b);
    	}
    }
}

