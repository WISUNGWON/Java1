package bookshelf;

//상속과 implements 둘다 실행 
public class BookShelf extends Shelf implements Queue {

    
    @Override
    public void enQueue(String title) {
        shelf.add(title);
        
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }

}
