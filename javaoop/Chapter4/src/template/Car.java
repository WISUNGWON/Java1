package template;

public abstract class Car {
    
    public abstract void drive();
    public abstract void stop();
    
    public void startCar() {
        System.out.println("시동을 겹니다.");
    }
    
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }
    
    public void washCar() {
        
    }
    
    // 틀이 되는 메서드를 재정의 할 수 없게 만든다.
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar(); //훅 메서드 (하위클래스가 재정의 해야 기능을하는 메서드)
    }

}
