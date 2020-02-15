import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

 
public class Main {
 
    public static void main(String[] args) throws IOException{
    	
    
    	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	        int n = Integer.parseInt(br.readLine().trim());
    	        int[] arr = new int[n];
    	        StringTokenizer st = new StringTokenizer(br.readLine());
    	        for (int i=0; i < n; i++) {
    	            arr[i] = Integer.parseInt(st.nextToken());
    	            bw.write((arr[i]) + " ");
    	        }
    	        
    	        bw.flush();
    	        bw.close();
    	    
     }	
    		
   
}   	
    		
 /*
  *     arr[i] = Integer.parseInt(br.readLine().trim());
    	            String[] word = text.split(" ");
    	            int a = Integer.parseInt(word[0]);
    	            int b = Integer.parseInt(word[1]);
    	            bw.write((a+b) + "\n");
  */
    		

