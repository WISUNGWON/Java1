package cooperation;

public class Bus {
    
    int busNumber;
    int passengerCount;
    int income;
    
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }
    
    public void take(int income) { //승채
        this.income += income; 
        passengerCount++;
    }
    
    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + income + "입니다.");
    }

}
