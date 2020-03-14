package cooperation;

public class Subway {
    
    int lineNumber;
    int passengerCount;
    int income;
    
    public Subway(int lineNumber) {
       this.lineNumber = lineNumber;
    }
    
    public void take(int income) {
        this.income += income;
        passengerCount++;
    }
    
    public void showSubwayInfo() {
        System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + income + "입니다.");
    }
}
