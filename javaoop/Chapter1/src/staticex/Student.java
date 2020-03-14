package staticex;

public class Student { 
	
    private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public String studentAddress;
	
	public Student(String name) {
	    studentName = name;
	    serialNum++;
	    this.studentID = serialNum;
	}
	
	public Student(int id, String name) {
	    this.studentID = id;
	    this.studentName = name;
	    this.studentID = serialNum;
	}

    public static int getSerialNum() {
        int i = 0;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
	
	
}

