package generic;

public class Powder extends Material {
    
    public String toString() {
        return "This is Powder";
    }
    
    @Override
    public void doPrinting() {
        System.out.println("Powder printing");
        
    }

}
