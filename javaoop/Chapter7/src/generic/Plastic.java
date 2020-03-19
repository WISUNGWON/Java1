package generic;

public class Plastic extends Material {
    
    public String toString() {
        return "This is Plastic";
    }

    @Override
    public void doPrinting() {
        
        System.out.println("Plastic printing");
        
    }

}
