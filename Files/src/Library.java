
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void loadBooks(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String regex = "^(.*?),\\s*(.*?),\\s*(\\d{4})$";
            while ((line = br.readLine()) != null) {
               //  TODO

                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line);

                if (matcher.find()) {
                    String title = matcher.group(1);
                    String author = matcher.group(2);
                    int year = Integer.parseInt(matcher.group(3));

                    books.add(new Book(title,author,year));

                } else {
                    System.out.println("No match found.");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchBookByKeyword(String keyword) {
        // TODO missing code

        keyword = keyword.toLowerCase();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword)
                    || book.getAuthor().toLowerCase().contains(keyword)
                    || String.valueOf(book.getPublicationYear()).equals(keyword))
                return book;
        }
        return null;
    }



public void bubbleSort(String criterion) {
    Comparator<Book> comparator;
    switch (criterion) {
        case "title":
            comparator = Comparator.comparing(Book::getTitle);
            break;
        case "author":
            comparator = Comparator.comparing(Book::getAuthor);
            break;
        case "year":
            comparator = Comparator.comparing(Book::getPublicationYear);
            break;
        default:
            throw new IllegalArgumentException("Invalid sorting criterion: " + criterion);
    }
    SortUtil.bubbleSort(books, comparator);
}

public void insertionSort(String criterion) {
    Comparator<Book> comparator;
    switch (criterion) {
        case "title":
            comparator = Comparator.comparing(Book::getTitle);
            break;
        case "author":
            comparator = Comparator.comparing(Book::getAuthor);
            break;
        case "year":
            comparator = Comparator.comparing(Book::getPublicationYear);
            break;
        default:
            throw new IllegalArgumentException("Invalid sorting criterion: " + criterion);
    }
    SortUtil.insertionSort(books, comparator);
}

public void quickSort(String criterion) {
    Comparator<Book> comparator;
    switch (criterion) {
        case "title":
            comparator = Comparator.comparing(Book::getTitle);
            break;
        case "author":
            comparator = Comparator.comparing(Book::getAuthor);
            break;
        case "year":
            comparator = Comparator.comparing(Book::getPublicationYear);
            break;
        default:
            throw new IllegalArgumentException("Invalid sorting criterion: " + criterion);
    }
    SortUtil.quickSort(books, comparator, 0, books.size() - 1);
}

    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}
