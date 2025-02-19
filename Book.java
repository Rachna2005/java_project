public class Book {
    
    static int idCounter = 0;
    int id;
    String title;
    Author author; 
    int publishedYear;
    String isbn;
    Category category; 
    int numOfBook;

    // Constructor
    public Book(String title, int publishedYear, Author author, Category category, int numOfBook) {
        this.id = ++idCounter;  // Unique ID for each book
        this.title = title;
        this.publishedYear = publishedYear;
        this.author = author;
        this.category = category;
        this.numOfBook = numOfBook;
    }

}
