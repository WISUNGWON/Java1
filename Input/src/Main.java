import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		int z = n;
		
		for (int i=1; i<=n+1; i++) {
			
			bw.write(z+ "\n");
			z = z-1;
			
		}
		
		bw.flush();
		bw.close();
	
		
		
	}
}
