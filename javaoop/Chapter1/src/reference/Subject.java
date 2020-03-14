package reference;

//과목과 관련된 맴버들을 Subject에 정의
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
