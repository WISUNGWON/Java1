package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {
        
        
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");
        
        //collection에서 stream을 사용할 때는 객체에 담는다
        Stream<String> stream = sList.stream();
        //리스트의 이름 출력
        stream.forEach(s -> System.out.print(s + " "));
        System.out.println();
        
        //출력을 하는데 소팅하고 싶을 때      
        sList.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        
        //각 이름의 길이를 map으로 가져와서 forEach로 하나씩 출력함.
        sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));

    }

}
