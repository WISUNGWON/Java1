package lambda;

public class TestStringConcat {
    
    public static void main(String[] args) {
        
        //객체지향에서 메서드 사용방식
        StringConImpl impl = new StringConImpl(); 
        impl.makeString("hello", "world");
        
        //람다를 이용한 메서드 사용
        /*
         * 클래스 구현과, 함수 구현이 없어 코드가 간단해짐.
         * 함수 베이스 프로그램
         */
        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString("hello", "world");
        
        //람다식 구현 원리 
        //내부적으로 익명 내부 클래스를 구현함 
        StringConcat concat2 = new StringConcat() {
            
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "," + s2);
                
            }
        };
        
        concat2.makeString("hello", "world");
    }
    


}
