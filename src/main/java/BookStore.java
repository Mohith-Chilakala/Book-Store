import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {
    private final static List<Book> books = new ArrayList<>();

    public static void add() throws InvalidBookException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Id : "); String id = scanner.nextLine();
        System.out.print("Title : "); String title = scanner.nextLine();
        System.out.print("Author : "); String author = scanner.nextLine();
        System.out.print("Category : "); String category = scanner.nextLine();
        System.out.print("Price : "); float price = scanner.nextFloat();

        Book book = new Book(id, title, author, category, price);

        if( Validate.check(book) ) books.add(book);
        else throw new InvalidBookException("Invalid book");
    }

    public static Book searchByTitle(String title) {
        return books.stream().filter(book -> book.getTitle().equals(title)).findFirst().orElse(null);
    }

    public static List<Book> searchByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author)).toList();
    }

    public static void display() {
        for (Book book : books)
            System.out.println(book);
    }
}
