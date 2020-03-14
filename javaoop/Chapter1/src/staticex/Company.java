package staticex;

public class Company {
    
    private static Company instance = new Company(); //private의 유일한 인스턴스를 만들어줌.
    
    private Company() {} // 생성자가 있기 때문에, 컴파일러가 생성자를 제공해주지 않지만, private로 선언했기 때문에 외부에서 생성자에 접근할 수 없게되어 인스턴스를 생성할 수 없는 상태가 됨.

    public static Company getInstance() { 
        
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
