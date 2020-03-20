package collection.set.treeset;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");
        
        /*String에 Comparable인터페이스가 구현되어 있기 때문에
         * 값들이 기본적을 오름차순으로 정렬되어 출력됨.  
         */
        
        for (String str : treeSet) {
            System.out.println(str);
        }

    }

}
