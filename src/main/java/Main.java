import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        while(true) {
            System.out.println("""
                
                ---MENU---
                1 to add book\s
                2 to search a book by title\s
                3 to search a book by author\s
                4 to display all books\s
                5 to stop""");

            System.out.print("Choice : ");
            choice = new Scanner(System.in).nextInt();
            System.out.println();

            switch (choice) {
                case 1 : try {
                            BookStore.add();
                            System.out.println("Book added \n");
                         }
                         catch (InvalidBookException ignored) { System.out.println("Invalid book \n"); }
                         break;
                case 2 : System.out.print("Title : "); String title = new Scanner(System.in).nextLine();
                         System.out.println( BookStore.searchByTitle(title) );
                         break;
                case 3 : System.out.print("Author : "); String author = new Scanner(System.in).nextLine();
                         System.out.println( BookStore.searchByAuthor(author) );
                         break;
                case 4 : BookStore.display(); break;
                case 5 : return;
                default : System.out.println("Invalid choice");
            }
        }
    }
}
