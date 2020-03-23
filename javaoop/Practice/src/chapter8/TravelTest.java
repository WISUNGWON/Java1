package chapter8;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

    public static void main(String[] args) {
        
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("이순신", 13, 50);
        
        List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);
        
        System.out.println(customerList);
        
        // print customers' name by using stream
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
        // print customers' total price
        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println(total);
        
        // get customers' name over age 20 and sort them then print 
        customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).forEach(s -> System.out.println(s));
        
        

        

    }

}
