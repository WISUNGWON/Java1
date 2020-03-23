package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//메서드 구현부가 길어질 경우 BinaryOperator를 구현한다.
class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length)
            return s1;
        else return s2;
    }
    
}

public class ReduceTest {

    public static void main(String[] args) {
       
        
        String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다"};
        
        //가장 긴 문자열을 반환하는 reduce 메서드 구현
       System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> 
        { if (s1.getBytes().length >= s2.getBytes().length)
            return s1;
        else return s2;
        }));
                
           
       // BinaryOperator를 구현한 CompareString 객체를 reduce에 넣어준다.
       System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
    }

}
