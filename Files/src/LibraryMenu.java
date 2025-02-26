import java.util.Scanner;

public class LibraryMenu {
    private Library library;
    private UserInteractionLogger logger = new UserInteractionLogger();

    public LibraryMenu(Library library) {
        this.library = library;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        logger.log("Program started and menu displayed.");
        while (true) {
            System.out.println("\n");
            System.out.println("=== Main Menu ===");
            System.out.println("1. View All Books");
            System.out.println("2. Sort Books by Title");
            System.out.println("3. Sort Books by Author");
            System.out.println("4. Sort Books by Year");
            System.out.println("5. Search for a Book by keyword");
            System.out.println("6. Exit\n");
            System.out.print("Enter your choice: ");

            int choice = 0 ;
            String input = scanner.next();
            try {
                 choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                choice = 0;
            }

            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    library.viewAllBooks();
                    logger.logViewAllBooks();
                    break;
                case 2:
                    library.bubbleSort("title");
                    library.viewAllBooks();
                    logger.logSort("title");
                    break;
                case 3:
                    library.insertionSort("author");
                    library.viewAllBooks();
                    logger.logSort("author");
                    break;
                case 4:
                    library.quickSort("year");
                    library.viewAllBooks();
                    logger.logSort("year");
                    break;
                case 5:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    System.out.println(library.searchBookByKeyword(keyword).toString());
                    logger.logSearch(keyword);
                    break;
                case 6:
                    logger.log("Exited the program.");
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    logger.log("Invalid menu choice.");
            }
        }
    }
}
