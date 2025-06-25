package designpatterns.singleton.library;

public class Client {
    public static void main(String[] args) {
        LibraryManager libraryManager = LibraryManager.getInstance();
        LibraryManager libraryManager2 = LibraryManager.getInstance();

        libraryManager.addBook(new Book("Design Patterns", "Erich Gamma"));
        libraryManager.print();

        libraryManager2.print();
        System.out.println(libraryManager == libraryManager2);
    }
}
