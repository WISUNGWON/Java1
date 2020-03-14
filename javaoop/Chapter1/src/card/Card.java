package card;

public class Card {
    
    private static int serialNumber = 10000;
    private int cardNumber;
    
    Card () {
        serialNumber++;
        this.cardNumber = serialNumber;
    }
    
    public int getCardNumber() {
        return cardNumber;
    }
    


}
