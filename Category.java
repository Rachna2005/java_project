<<<<<<< HEAD


public class Category {
   
}
=======
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Category {
    private String name;
    private List<Book> books;

    // Constructor
    public Category(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the category
    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Invalid book. Cannot add null to category.");
            return;
        }
        books.add(book);
        System.out.println("Book added to category '" + name + "': " + book.getTitle());
    }

    // Remove a book from the category 
    public void removeBook(String ID) {
        if (ID == null || ID.isEmpty()) {
            System.out.println("Invalid ISBN.");
            return;
        }

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getID().equals(ID)) {
                iterator.remove();
                System.out.println("Book removed from category '" + name + "': " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ID " + ID + " not found in category '" + name + "'."); // Corrected this line
    }

    // Display all books in the category
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in category '" + name + "'.");
        } else {
            System.out.println("Books in category '" + name + "':");
            for (Book book : books) {
                System.out.println(book); // Uses the toString method of Book
            }
        }
    }

    // Getter for category name
    public String getName() {
        return name;
    }

    // Getter for books list (if needed for external access)
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
>>>>>>> 267b3edcd5d2c344cccd7adc14b00c55e24c8b66
