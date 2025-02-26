public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.loadBooks("Files/src/resources/data/books.txt");

        LibraryMenu menu = new LibraryMenu(library);
        menu.displayMenu();
    }
}
