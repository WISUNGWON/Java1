package string;

public class StringTest {

    public static void main(String[] args) {
        
        
        String str1 = new String("abc");
        String str2 = new String("abc");
        
        System.out.println(str1 == str2);
        
        // 리터럴이 모여있는 상수풀에서 가져옴
        String str3 = "abc";
        String str4 = "abc";
        
        System.out.println(str3 == str4);

    }

}
