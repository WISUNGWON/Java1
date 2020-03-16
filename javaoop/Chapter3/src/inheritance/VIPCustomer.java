package inheritance;

public class VIPCustomer extends Customer {
    
    
    double salesRatio;
    private int agentID;
    
    public VIPCustomer() {}
    public VIPCustomer(int customerID, String customerName) {
        
        this.customerID = customerID;
        this.customerName = customerName;
        
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
    

}
