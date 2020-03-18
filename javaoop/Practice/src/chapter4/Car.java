package chapter4;

public abstract class Car {
    
    public abstract void start();
    
    public abstract void drive();
    
    public abstract void stop();
    
    public abstract void turnoff();
    

    
    
    final void run(){
        start();
        drive();
        stop();
        turnoff();
    }

}
