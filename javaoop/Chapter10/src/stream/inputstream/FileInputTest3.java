package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//byte array사용
public class FileInputTest3 {

    public static void main(String[] args) {
        
        try(FileInputStream fis = new FileInputStream("Input2.txt")){
              
           int i;
           byte[] bs = new byte[10];
           while ((i = fis.read(bs)) != -1){
               //버퍼를 사용하면 가비지 값이 남음.
               /*for (byte b : bs) {
                   System.out.print((char)b);
               }*/
               
               
               //읽은 개수 만큼 출력
               for (int k = 0; k < i; k++) {
                   System.out.print((char)bs[k]);
               }
               System.out.println();
           }
           
        } catch (IOException e) {
            e.printStackTrace();
        } 
        System.out.println("end");

    }

}
