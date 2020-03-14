package cooperation;

public class Taxi {
    
    int taxiNumber;
    int income;
    int passengerCount;
    
    public Taxi (int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }
    
    public void take (int income) {
        this.income += income;
        passengerCount++;
        
    }
    
    public void showTaxiInfo() {
        System.out.println(taxiNumber + "번 택시의 승객은 " + passengerCount + "명 이고, 수입은 " + income + "입니다.");
    }

}
