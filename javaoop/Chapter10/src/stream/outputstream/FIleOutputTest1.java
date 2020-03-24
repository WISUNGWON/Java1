package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputTest1 {

    public static void main(String[] args) {
        
        //인자값 true를 통해 생성한 output.txt에 wirte한 값을 append함
        try(FileOutputStream fos = new FileOutputStream("output.txt", true)){
            
            //파일 작성
            fos.write(65);
            fos.write(66);
            fos.write(67);
            
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
