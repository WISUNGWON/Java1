package string;

public class StringBuilderTest {

    public static void main(String[] args) {
        
        String java = new String("java");
        String android = new String("android");
        
        StringBuilder buffer = new StringBuilder(java);
        buffer.append("android");
        java = buffer.toString(); //String 반환
        
        System.out.println(java);

    }

}
