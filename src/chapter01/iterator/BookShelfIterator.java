package chapter01.iterator;


public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    //初始化书架和 index
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    //根据书架中现有书本的数量判断
    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    //返回下一本书，并且将 index 指向下一本书
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
