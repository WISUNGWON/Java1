package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourse {
    
    public static void main(String[] args) {
        
        //close를 하지 않아도 AutoCloseable을 해준다.
        try( FileInputStream fis = new FileInputStream("a.txt")) {
         
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
