package classpart;

// �ϳ��� Java ���Ͽ� �پ��� Class�� ������ �� �ִ�.
//�ϳ��� Java���Ͽ��� public Ŭ������ 1���� �ְ�, �� Ŭ������ �̸��� Java ���ϰ� ���ƾ� �Ѵ�.
public class Student { 
	
	// �ɹ� ���� 
	public int studentID = 1; 
	public String studentName = "Steve";
	public String studentAddress = "���α�";
	
	// �޼���(���)
	public void showStudentInfo () {
		System.out.println(studentName + "," + studentAddress);
	}

}
