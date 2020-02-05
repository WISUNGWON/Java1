import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {

	public static void main(String[] args) throws IOException {
		
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String n = br.readLine();
			String[] test = n.split(" ");
			int a = Integer.parseInt(test[0]); 
			int b = Integer.parseInt(test[1]); 
			String number = br.readLine();
			String[] StringArr = number.split(" ");
			int[] numberArr = new int[a];
			
			
			for (int i = 0; i<a; i++) {
				numberArr[i] = Integer.parseInt(StringArr[i]);
		
			}
			
	
			for (int j=0; j<a; j++) {
				if (numberArr[j] < b) {
					bw.write(numberArr[j] + " ");
				}
				
			}
			
			
			bw.flush();
			bw.close();
		
	}
}
