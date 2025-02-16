public class Book {
    private static int idCounter = 0;
    private int id;
    private String title;
    private int publishedYear;
    private Author author;
    private Category category;
    private int numOfBook;

    // Constructor
    public Book(String title, int publishedYear, Author author, Category category, int numOfBook) {
        this.id = ++idCounter;  // Unique ID for each book
        this.title = title;
        this.publishedYear = publishedYear;
        this.author = author;
        this.category = category;
        this.numOfBook = numOfBook;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Title
    public String getTitle() {
        return title;
    }

    // Getter for number of books
    public int getNumOfBook() {
        return numOfBook;
    }

    // Getter for Author
    public Author getAuthor() {
        return author;
    }

    // Getter for Published Year
    public int getPublishedYear() {
        return publishedYear;
    }

    // Getter for Category
    public Category getCategory() {
        return category;
    }
}
