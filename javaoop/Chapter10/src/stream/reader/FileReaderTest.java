package stream.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {
        
        //FileReader를 통해 문자열 읽기.
        FileReader fis = new FileReader("reader.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char)i);
        }
        
        fis.close();
        
        System.out.println();
        
        //보조 스트림을 통한 문자열 읽기 
        FileInputStream fis2 = new FileInputStream("reader.txt");
        InputStreamReader isr = new InputStreamReader(fis2);
        int j;
        while ((j = isr.read()) != -1) {
            System.out.print((char)j);
        }
        
        isr.close();
   

    }

}
