package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    
    //throws 통해 예외 처리 미루기 
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        
        
        //메서드를 호출한 곳에서 try catch를 통해 예외를 처리
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.String");
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            /*
             * 디폴트 exception : Exception이 최상위이기 때문에 
             * 모든 예외가 업캐스팅이 되고,
             * 이미 정의한 예외 이외의 error가 발생할 경우를 대비함.
             * 디폴트 exception은 맨 뒤에 처리해야 한다.
             */
        } catch(Exception e) { 
            System.out.println(e);
        }
        System.out.println("end");
    

    }

}
