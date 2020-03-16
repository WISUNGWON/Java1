package array;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        
        //add : list에 순서대로 element를 추가
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        
        //size() : list에 들어있는 element의 개수 리턴
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i); //get(i) : i번째의 element를 받아온다.
            System.out.println(str);
        }
        
        for (String s : list) {
            System.out.println(s);
        }

    }

}
