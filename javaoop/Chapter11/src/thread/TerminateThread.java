package thread;

import java.io.IOException;

public class TerminateThread extends Thread {
    
    private boolean flag = false;
    int i;
    
    public TerminateThread(String name) {
        super(name);
    }
    
    public void run() {
        while (!flag) {
            
            try {
                sleep(100);//0.1초
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
        
        
        System.out.println(getName() + "end");
    }
    
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {
        
        TerminateThread threadA = new TerminateThread("A");
        TerminateThread threadB = new TerminateThread("B");
        
        threadA.start();
        threadB.start();
        
        int in;
        while (true) {
            in = System.in.read(); //enter를 입력하면 \n, \r이 입력된다.
            if (in == 'A') {
                threadA.setFlag(true);
            }
            else if (in == 'B') {
                threadB.setFlag(true);
            } 
            else if (in == 'M') {
                threadA.setFlag(true);
                threadB.setFlag(true);
                break;
            }
            else {
               // System.out.println("try again");
            }
            
        }
        System.out.println("Main End");
    }

}
