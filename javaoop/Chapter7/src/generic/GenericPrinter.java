package generic;

//T로 들어올 type은 Material을 상속받은 값이어야 한다 
//GenericPrinter가 Material의 하위 클래스라는의미가 아님.
public class GenericPrinter<T extends Material>  {
   
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    } 
    
    public String toString() {
        return material.toString();
    }
    
    public void printing() {
        
        material.doPrinting();
        
    }

}
