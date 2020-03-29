package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        
       //HashMap 생성 : HashMap<"key", value>
       //key 값은 중복이 불가능, value는 중복가능, null 값도 사용 가능
       //멀티 쓰레드에서는 HashTable을 사용
       HashMap<String, Integer> map = new HashMap<String, Integer>();
       
       //HashMap에 자료 넣기
       map.put("A", 1);
       map.put("B", 2);
       map.put("C", 3);
       
       //get(key) : 지정된 Key의 '값'을 반환
       int val = map.get("B");
       System.out.println("Value for key B is : " + val);
       
       //Keyset() : HashMap의 모든 키가 저장된 Set을 반환
       Set keyset = map.keySet();
       System.out.println("Key set values are " + keyset);
       
       //entrySet()
       Set set = map.entrySet();
       System.out.println("Set values are " + set);
       
       Iterator ir = set.iterator();
       
       while(ir.hasNext()) {
           String str = (String) ir.next();
           System.out.println(str);
       }
       
       
       HashMap<Integer, String> map2 = new HashMap<Integer, String>();
       
       map2.put(1, "A");
       map2.put(2, "B");
       map2.put(3, "C"); //1)
       map2.put(3, "D"); //2)
       
       /*
        * HashMap에서 Key값은 중복이 되지 않기 때문에,
        * 1), 2)와 같은 상황에서는 나중에 들어온 key값의 value로 update됨.
        */
       
       String val2 = map2.get(1);
       System.out.println("Value for key 1 is : " + val2);
       
       System.out.println(map2);
       
       
       
       

    }

}
