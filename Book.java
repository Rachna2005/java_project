public class Book {
    int id = 0;
    String title;
    Author author; 
    int publishedYear;
    String isbn;
    Category category; 
    int numOfBook;
    // Constructor
    Book(int id, String title, Author author, int publishedYear, String isbn, Category category, int numOfBook) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.isbn = isbn;
        this.category = category;
        this.numOfBook = numOfBook;
    }
}
