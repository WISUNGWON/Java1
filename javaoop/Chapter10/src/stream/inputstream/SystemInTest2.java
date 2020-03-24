package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

    public static void main(String[] args) {
        
        System.out.println("입력:");
        
        //enter를 입력하기 전까지 1바이트의 문자 출력 
        try {
         int i;
         while((i = System.in.read()) != '\n') {
             System.out.print((char)i);    
         }
              
        } catch (IOException e) {
         e.printStackTrace();
        }

    }

}
