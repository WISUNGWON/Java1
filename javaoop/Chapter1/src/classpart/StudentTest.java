package classpart;

import java.util.Scanner;

//정의한 Student클래스를 사용하는 main 클래스
public class StudentTest {

	public static void main(String[] args) {
	
		Student studentLee = new Student();
		// Student 클래스를 메모리에 생성 (사용할 준비를 함)
		studentLee.studentName = "이순신";
		studentLee.studentAddress = "서울";
		
		studentLee.showStudentInfo();


	}

}
