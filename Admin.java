import java.net.IDN;

import com.library.system.Book;

public class Admin extends User{
    private Library library;

    // Constructor
    public Admin(String username, String password, String email, String phoneNumber, Library library) {
        super(username, password, email, phoneNumber); 
        this.library = library;
    }
    // Method to add a book
public void addBook(String title, String author, String ID) {
    Book book = new Book(title, author, ID);
    library.addBook(book);
}

// Method to remove a book
public void removeBook(String ID) {
    library.removeBook(ID);
}

// Method to display all books
public void displayBooks() {
    library.displayBooks();
}

// Method to display admin contact information
public void displayContactInfo() {
    System.out.println("Admin Contact Information:");
    System.out.println("Email: " + getEmail());
    System.out.println("Phone: " + getPhoneNumber());
}
}
