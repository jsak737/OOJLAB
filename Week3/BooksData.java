import java.util.Scanner; 

class Book {
    String name;
    String author;
    int price;
    int numPages;

    Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        String bookDetails = "Book Name: " + this.name + "\n" +
                             "Author Name: " + this.author + "\n" +
                             "Price: " + this.price + "\n" +
                             "Number of Pages: " + this.numPages + "\n";
        return bookDetails;
    }
} 

public class BooksData {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in); 

        System.out.print("Enter the Number of Books: ");
        int n = s.nextInt(); 

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of book " + (i + 1) + ": ");
            String name = s.next();
            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = s.next();
            System.out.print("Enter price of book " + (i + 1) + ": ");
            int price = s.nextInt();
            System.out.print("Enter number of pages in book " + (i + 1) + ": ");
            int numPages = s.nextInt();

            books[i] = new Book(name, author, price, numPages);
        }

        System.out.println("\nBook Details:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("J S AMOGH KRISHNA 1BM23CS029");
        s.close();
    }
}
