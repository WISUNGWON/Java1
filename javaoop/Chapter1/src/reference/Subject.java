package reference;

//����� ���õ� �ɹ����� Subject�� ����
public class Subject {
	
	String subjectName;
	int score;
	
	public Subject () {}
	
	public Subject (String name, int score) {
		subjectName = name;
		this.score = score;
	}
	
	public void setSubject (String name, int score) {
		subjectName = name;
		this.score = score;
	}
	
}
