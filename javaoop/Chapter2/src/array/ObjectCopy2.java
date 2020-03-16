package array;

public class ObjectCopy2 {
    public static void main(String[] args) {
        
        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];
        
        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");
        
        copylibrary[0] = new Book(); //새로운 인스턴스를 생성했기 때문에, 주소값이 다르다.
        copylibrary[1] = new Book();
        copylibrary[2] = new Book();
        copylibrary[3] = new Book();
        copylibrary[4] = new Book();
        
        //향상된 for 문
        for (int i = 0; i < library.length; i++) {
           copylibrary[i].setBookName(library[i].getBookName());
           copylibrary[i].setAuthor(library[i].getAuthor());
        }
        
        
        
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
