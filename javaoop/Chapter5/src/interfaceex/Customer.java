package interfaceex;

//다양한 인터페이스 implements
public class Customer implements Buy, Sell {

    @Override
    public void sell() {
        System.out.println("customer sell");
        
    }

    @Override
    public void buy() {
       System.out.println("customer buy");
        
    }

    @Override
    public void order() {
       System.out.println("customer order"); //어노테이션으로 어떤 값인지 명시하고 재정의하기
       // Buy.super.order(); Buy.super를 통해 어떤 값인지 명시하기
    }
    
    public void sayHello() {
        System.out.println("hello");
    }
    

}
