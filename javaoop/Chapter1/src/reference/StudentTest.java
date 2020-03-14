package reference;import java.util.Calendar;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
//		studentLee.setKoreaSubject("����", 100);
//		studentLee.setMathSubject("����", 95);
		Subject sub = new Subject(); //�̰͵� �ᱹ �ʱ�ȭ�� �Ѱ�
		
		studentLee.korea = sub;
		studentLee.korea.score = 100;

		System.out.println(studentLee.korea.score);
//		studentLee.korea.setSubject("����", 100);
//		studentLee.math.setSubject("����", 95);
//
//		
//		Student studentKim = new Student(101, "kim");
////		studentKim.setKoreaSubject("����", 80);
////		studentKim.setMathSubject("����", 95);
//		studentKim.korea.setSubject("����", 95);
//		System.out.println(studentKim.math.score);
//		studentKim.math.setSubject("����", 50);
//	
//		
//		System.out.println(studentLee.korea.score);
//		System.out.println(studentKim.math.score);
//		studentLee.showStudentScore();
//		studentKim.showStudentScore();
		
		System.out.println(Calendar.getInstance().get(Calendar.YEAR)));

	}

}
