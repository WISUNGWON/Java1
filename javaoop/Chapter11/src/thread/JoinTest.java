package thread;

public class JoinTest extends Thread {
    
    int start;
    int end;
    int total;
    
    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public void run() {
        int i;
        for (i = start; i <= end; i++) {
            total += i;
        }
    }
    public static void main(String[] args) { //각 쓰레드를 동작시키는 변수를 만나면 일단 그 쓰레드를 실행함(무조건적은아님) 따라서 join 필요.
        
        System.out.println("start");
        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);
        
        jt1.start();
        jt2.start();
        
        try {
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(jt1.total);
        System.out.println(jt2.total);
        
        int total =jt1.total + jt2.total;
        
        System.out.println(total);
      
        System.out.println("jt1.total = " + jt1.total);
        System.out.println("jt2.total = " + jt2.total);
        
        System.out.println(total);
        
        System.out.println("end");
    }

}
