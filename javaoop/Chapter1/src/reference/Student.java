package reference;

//Student�� ���õ� �ɹ����� Student Ŭ������ ����
public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea; //���� �ڷ��� Ÿ������ ������ ����. Subject Ŭ������ ���� �ڷ��� Ÿ������, Student�� �ɹ��� ��.
	Subject math;
	
	public Student(int id, String name) { 
		studentID = id;
		studentName = name;	
//		korea = new Subject(); 	 //�ν��Ͻ��� �����ϸ鼭, ���� �ڷ��� �ʱ�ȭ. ���� ������ ���� �ڷ��� ���� Subject�� �ɹ����� ����� �� ����.
//		math = new Subject("����", 95);
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
		System.out.println(studentName + " �л��� ������ " + total + " �� �Դϴ�. " );
	}
	
}
