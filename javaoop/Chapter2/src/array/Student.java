package array;

import java.util.ArrayList;

public class Student {
    
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList; //학생이 듣는 과목들의 배열
    
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        
        subjectList = new ArrayList<Subject>();
    }
    
    //학생이 듣는 과목을 배열로 관리.
    public void addSubject(String name, int score) {
        Subject subject = new Subject(name, score);
        
        subjectList.add(subject);
    }
    public void showStudentInfo() {
        
        int total = 0;
        
        for (Subject subject : subjectList) {
            
            total += subject.getScore();
            System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScore() + "입니다.");
        }
        
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
        
    }
    
}
