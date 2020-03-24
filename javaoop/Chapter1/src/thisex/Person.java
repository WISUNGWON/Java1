package thisEX;

public class Person {
    
    String name;
    int age;
    
    public Person() {
        this("noName", 1); // Constructor call must be the first statement in a constructor
    }
    
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void showInfo() {
        System.out.println(name + "," + age);
    }
    
    public Person getSelf() {
        return this;
    }

}


