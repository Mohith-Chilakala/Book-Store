public class Book {
    private String book_id;
    private String title;
    private String author;
    private String category;
    private float price;

    public Book() {}
    public Book(String book_id, String title, String author, String category, float price) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getBook_id() {
        return book_id;
    }
    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nbook_id = " + book_id + '\n' +
            "title = " + title + '\n' +
            "author = " + author + '\n' +
            "category = " + category + '\n' +
            "price = " + price + '\n';
    }
}