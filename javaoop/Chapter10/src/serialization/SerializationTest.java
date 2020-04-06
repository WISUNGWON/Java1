package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable { //Externalizable (구현할 수 있는 메서드가 있음) 
    String name;
    transient String job; //transient : 해당 변수는 직렬화 하지 않는다. (ex 소켓 등에 사용) 
    
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
    
    public String toString() {
        return name + "," + job;
    }
}
public class SerializationTest {

    public static void main(String[] args) {
        
        Person personLee = new Person("이순신", "엔지니어");
        Person personKim = new Person("김유신", "선생님");
        
        try (FileOutputStream fos = new FileOutputStream("setial.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(personLee);
            oos.writeObject(personKim);
        } catch (IOException e) {
            System.out.println(e);
        }
        
        try (FileInputStream fis = new FileInputStream("setial.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)){
            
            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();
            
            System.out.println(p1);
            System.out.println(p2);
            
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        
         

    }

}
