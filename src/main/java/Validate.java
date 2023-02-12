import java.util.ArrayList;
import java.util.List;

public class Validate {
    public static boolean check(Book book) {
        String bookId = book.getBook_id();

        List<String> categories = new ArrayList<>();
        categories.add("Science");
        categories.add("Fiction");
        categories.add("Technology");
        categories.add("Others");

        if( !categories.contains(book.getCategory()) ) return false;
        if(book.getPrice() < 0) return false;
        if(bookId.charAt(0) != 'B' || bookId.length() > 4) return false;

        return true;
    }
}
