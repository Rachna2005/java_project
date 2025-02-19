public class Book {
    
    static int id = 0;
    String title;
    Author author; 
    int publishedYear;
    String isbn;
    Category category; 
    int numOfBook;
    // Constructor
    public Book(String title,  int publishedYear, Author author, String isbn, Category category, int numOfBook) {
        id = id + 1;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.isbn = isbn;
        this.category = category;
        this.numOfBook = numOfBook;
    }

    public int getid() {
        return id;
    }
    
}
