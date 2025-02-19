import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Library {
    private List<Author> authors;
    private List<Book> books;
    private List<Category> categories;
    private List<Transaction> transactions;

    public Library() {
        authors = new ArrayList<>();
        books = new ArrayList<>();
        categories = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Add an author
    public void addAuthor(Author author) {
        authors.add(author);
    }

    // Get all authors
    public List<Author> getAuthors() {
        return authors;
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Get all books
    public List<Book> getBooks() {
        return books;
    }

    // Add a category
    public void addCategory(Category category) {
        categories.add(category);
    }

    // Get all categories
    public List<Category> getCategories() {
        return categories;
    }

    // Add a transaction
    public void borrowBook(int userId, int bookId) {
        Book book = findBookById(bookId);
        if (book != null && book.numOfBook > 0) {
            book.numOfBook--; // Reduce available book count
            transactions.add(new Transaction(userId, bookId, new Date()));

        } else {
            System.out.println("Book not available");
        }
    }

    // Find a book by ID
    private Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.id == bookId) {
                return book;
            }
        }
        return null;
    }

    // Display all transactions
    public List<Transaction> getTransactions() {
        return transactions;
    }
}