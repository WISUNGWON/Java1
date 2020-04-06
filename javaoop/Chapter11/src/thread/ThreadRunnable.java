package thread;

class MyThread2 implements Runnable {

    @Override
    public void run() {
            int i;
            
            for (i = 0; i <= 200; i++) {
                System.out.println(i + "\t");
                
                try {
                    Thread.sleep(100); //sleep :  Thread class의 static method
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        
        
    

}
public class ThreadRunnable {
    //프로그램을 실행하면 총 3개의 쓰레드가 진행됨 (main, th1, th2)
    public static void main(String[] args) { //먼저 main쓰레드가 실행되어 start를 출력하고 th1과 th2를 띄워준뒤 end를 출력하여 먼저 끝난다. 
        
        System.out.println("start");
        
        MyThread2 runner1 = new MyThread2();
        Thread th1 = new Thread(runner1);
        th1.start();
        
        MyThread2 runner2 = new MyThread2();
        Thread th2 = new Thread(runner2);
        th2.start();

        System.out.println("end");

    }

}
