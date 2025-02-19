public class Book {
<<<<<<< HEAD
    
    static int id = 0;
    String title;
    Author author; 
    int publishedYear;
    String isbn;
    Category category; 
    int numOfBook;
=======
    private static int idCounter = 0;
    private int id;
    private String title;
    private int publishedYear;
    private Author author;
    private Category category;
    private int numOfBook;

>>>>>>> 267b3edcd5d2c344cccd7adc14b00c55e24c8b66
    // Constructor
    public Book(String title, int publishedYear, Author author, Category category, int numOfBook) {
        this.id = ++idCounter;  // Unique ID for each book
        this.title = title;
        this.publishedYear = publishedYear;
        this.author = author;
        this.category = category;
        this.numOfBook = numOfBook;
    }

<<<<<<< HEAD
    public int getid() {
=======
    // Getter for ID
    public int getID() {
>>>>>>> 267b3edcd5d2c344cccd7adc14b00c55e24c8b66
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
