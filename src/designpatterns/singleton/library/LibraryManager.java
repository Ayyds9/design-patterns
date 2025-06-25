package designpatterns.singleton.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> books = new ArrayList<Book>();
    private LibraryManager() {

    }
    public static class LibraryManagerHolder {
        private static final LibraryManager INSTANCE = new LibraryManager();
    }

    public static LibraryManager getInstance() {
        return LibraryManagerHolder.INSTANCE;
    }

    public void addBook(Book book) {
        System.out.println("Book added: " + book.getTitle());
        books.add(book);
    }

    public void print() {
        for (Book book : books) {
            System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
