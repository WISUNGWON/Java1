package object;

class Student{
    int studentNum;
    String studentName;
    
    public Student(int studentNum, String studentName) {
        this.studentName = studentName;
        this.studentNum = studentNum;
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student)obj;
            if (this.studentNum == std.studentNum) {
                return true;
            }
            else {
                return false;
            }
            
        }
        return false;
    }
}

public class EqualsTest {

    public static void main(String[] args) {
        
        String str1 = new String("abc");
        String str2 = new String("abc");
        
        //메모리 주소값 확인
        System.out.println(str1 == str2);
        //실제 값 비교 
        System.out.println(str1.equals(str2));
        
        Student Lee = new Student(100, "이상원");
        Student Lee2 = Lee;
        Student Sang = new Student(100, "이상원");
        
        System.out.println(Lee == Lee2); //true
        
        System.out.println(Lee == Sang); //false
        
        System.out.println(Lee.equals(Sang)); //true
        
        System.out.println(Lee);
        System.out.println(Lee2);
        System.out.println(Lee.hashCode());
        System.out.println(Lee2.hashCode());
        System.out.println(Sang.hashCode());
        System.out.println(System.identityHashCode(Lee));
        System.out.println(System.identityHashCode(Lee2));
        System.out.println(System.identityHashCode(Sang));
    

    }

}
