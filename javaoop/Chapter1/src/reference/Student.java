package reference;

//Student와 관련된 맴버들을 Student 클래스에 정의
public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea; //참조 자료형 타입으로 변수를 선언. Subject 클래스가 참조 자료형 타입으로, Student의 맴버가 됨.
	Subject math;
	
	public Student(int id, String name) { 
		studentID = id;
		studentName = name;	
//		korea = new Subject(); 	 //인스턴스를 생성하면서, 참조 자료형 초기화. 하지 않으면 참조 자료형 변수 Subject의 맴버들을 사용할 수 없다.
//		math = new Subject("수학", 95);
	}
	
//	public void setKoreaSubject(String name, int score) {
//		korea.subjectName = name;
//		korea.score = score;
//	}
//	
//	public void setMathSubject(String name, int score) {
//		math.subjectName = name;
//		math.score = score;
//	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + " 점 입니다. " );
	}
	
}
