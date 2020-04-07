package thread;

class MyThread extends Thread {
    
    public void run() { //쓰레드가 start되면 run메서드가 실행되기 때문에 run을 구현해야 함.
        int i;
        
        for (i = 0; i <= 200; i++) {
            System.out.println(i + "\t");
            
            try {
                sleep(100); //sleep :  Thread class의 static method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadTest {
    //프로그램을 실행하면 총 3개의 쓰레드가 진행됨 (main, th1, th2)
    public static void main(String[] args) { //먼저 main쓰레드가 실행되어 start를 출력하고 th1과 th2를 띄워준뒤 end를 출력하여 먼저 끝난다. 
        
        System.out.println("start");
        
        MyThread th1 = new MyThread(); 
        MyThread th2 = new MyThread();
        
        th1.start(); // start() : 쓰레드 호출 명령어.
        th2.start(); //이후에 th1과 th2가 start되어 성능에따라 번갈아가면서 run메서드를 수행한다.
        
         
        Thread t = Thread.currentThread(); //현재 Thread의 정보 출력
        System.out.println(t);
        
        System.out.println("end");
        

    }

}
