import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String username;
    private String email;
    private String phoneNumber;

    private List<Book> library; // Using a list to store books

    // Constructor
    public Admin(String username, String email, String phoneNumber) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.library = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(String title, int publishedYear, Author author, Category category, int numOfBook) {
        if (title == null || title.isEmpty() || author == null || category == null || numOfBook < 1) {
            System.out.println("Invalid book details. Please provide complete information.");
            return;
        }
        Book book = new Book(title, publishedYear, author, category, numOfBook);
        library.add(book);
        System.out.println("Book added successfully: " + title);
    }

    // Method to remove a book by ID
    public void removeBook(int bookId) {
        boolean removed = library.removeIf(book -> book.getId() == bookId); // Remove book by ID
        if (removed) {
            System.out.println("Book removed successfully: ID " + bookId);
        } else {
            System.out.println("Book not found with ID: " + bookId);
        }
    }

    // Method to display all books
    public void displayBooks() {
        if (library.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("Library Books:");
        for (Book book : library) {
            System.out.println("Title: " + book.getTitle() + ", ID: " + book.getId() + ", Copies: " + book.getNumOfBook());
        }
    }

    // Method to display admin contact information
    public void displayContactInfo() {
        System.out.println("Admin Contact Information:");
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }
}
