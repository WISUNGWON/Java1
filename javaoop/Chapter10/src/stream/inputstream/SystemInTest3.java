package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest3 {

    public static void main(String[] args) {
        System.out.println("입력 후 '끝' 이라고 쓰세요:");
        
        /*
        //System.in은 inpurStream이기 때문에 1바이트씩 읽어들여
        //2바이트인 한글은 인식할 수 없음. 따라서 while문이 끝나지 않음.
        try {
         int i;
         while((i = System.in.read()) != '끝') {
             System.out.print((char)i);    
         }
              
        } catch (IOException e) {
         e.printStackTrace();
        }
        */
      
        //보조 스트림을 사용하여 한글을 읽어들임.
        try {
            int i;
            //InputStreamReader는 다른 Stream을 생성자의 매개변수로 받는다.
            InputStreamReader isr = new InputStreamReader(System.in);
            while((i = isr.read()) != '끝') {
                System.out.print((char)i);    
            }
                 
           } catch (IOException e) {
            e.printStackTrace();
           }
        //바이트단위로 자료를 읽을때, 그것을 다시 문자로 변환해줌 (InputStreamReader)

    }

}
