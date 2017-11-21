package chapter01.iterator;

public class IteratorMain {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book1"));
        bookShelf.appendBook(new Book("book2"));
        bookShelf.appendBook(new Book("book3"));
        bookShelf.appendBook(new Book("book4"));
        Iterator it = bookShelf.itreator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
