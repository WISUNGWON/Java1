package classpart;

// 하나의 Java 파일에 다양한 Class를 생성할 수 있다.
//하나의 Java파일에는 public 클래스가 1개만 있고, 그 클래스의 이름은 Java 파일과 같아야 한다.
public class Student { 
	
	// 맴버 변수 
	public int studentID = 1; 
	public String studentName = "Steve";
	public String studentAddress = "종로구";
	
	// 메서드(기능)
	public void showStudentInfo () {
		System.out.println(studentName + "," + studentAddress);
	}

}
