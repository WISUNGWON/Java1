package chapter2;

import java.util.ArrayList;

public class Student {
    
    private String studentName;
    private int serial = 1000;
    ArrayList<Book> bookList;
    
    public Student(String studentName) {
        
        this.studentName = studentName;
        serial++;
        
        bookList = new ArrayList<Book>();
    }
    
    public void addBook(String bookName) {
        
        Book book = new Book(bookName);
        bookList.add(book);
    }
    
    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void showBookList() {
        
        System.out.print(studentName + " 학생이 읽은 책은 : ");
        for (Book book : bookList ) {
            System.out.print(book.getBookName() + " ");
        }
        System.out.println("입니다");
        
    }
    
    

}
