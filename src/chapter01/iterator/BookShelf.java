package chapter01.iterator;

public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;
    //初始化书架最大容量
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }
    //获取书本
    public Book getBookAt(int index) {
        return books[index];
    }
    //添加书本
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    //获取现有书本数量
    public int getLength() {
        return last;
    }

    @Override
    public Iterator itreator() {
        return new BookShelfIterator(this);
    }
}
