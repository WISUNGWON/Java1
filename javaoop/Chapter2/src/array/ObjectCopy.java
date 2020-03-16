package array;

public class ObjectCopy {
    
    public static void main(String[] args) {
        
        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];
        
        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");
        
        //arraycopy 메서드를 이용한 얕은 복사.
        System.arraycopy(library, 0, copylibrary, 0, 5);
        
        //향상된 for 문
//        for (Book book : copylibrary) {
//            book.showBookInfo();
//        }
        
        library[0].setBookName("나목");
        library[0].setAuthor("박완서");
        
        for (Book book : library) {
            book.showBookInfo();
        }
        
        System.out.println("===============");
        
        for (Book book : copylibrary) {
            book.showBookInfo();
        }
        
        
    }
}
