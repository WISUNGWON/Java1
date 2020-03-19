package object;

//복제가능 mark interface
class Book implements Cloneable{
    String title;
    String author;
    int bookNum = 1000;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookNum++;
    }
    
    public String toString() {
        return author + "," + title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
    // 메서드를 main에 불러와서 사용하지 않고
    // 인스턴스가 힙 메모리에서 해제될 때 가비지 콜렉터가 실행한다.
    // 리소스의 해제, 소켓 close등을 수행함. 
    public void finalize() throws Throwable {
        super.finalize();
    }
    
    
}

public class ToStringTest {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Book book = new Book("토지", "박경리");
        
        System.out.println(book); 
        
        String str = new String("토지");
        System.out.println(str.toString()); 
        System.out.println(str);
        
        Book book2 = (Book)book.clone();
        System.out.println(book2);
        System.out.println(book.bookNum); //toString은 참조변수 자체를 출력하기 위함!
        
        
    }

}
