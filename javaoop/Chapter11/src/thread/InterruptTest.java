package thread;

public class InterruptTest extends Thread {
    
    public void run() {
        
        int i;
        for (i = 0; i < 100; i++) {
            System.out.println(i);
        }
        
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
            System.out.println("Wake!!!");
        }
        
        for (i = 0; i < 100; i++) {
            System.out.println(i);
        }
        
        
    }

    public static void main(String[] args) {
        
        
        InterruptTest test = new InterruptTest();
        test.start();
        test.interrupt(); //run메서드에 정의된 sleep을 거치지않고 바로 Interrupt Exception으로빠져서 다음 코드를 실행함.         
        System.out.println("end");

    }

}

