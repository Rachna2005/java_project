public class Book {
    
    static int id = 0;
    String title;
    // Author author; 
    int publishedYear;
    String isbn;
    Category category; 
    int numOfBook;
    // Constructor
    public Book(String title,  int publishedYear, String isbn, Category category, int numOfBook) {
        id = id + 1;
        this.title = title;
        // this.author = author;
        this.publishedYear = publishedYear;
        this.isbn = isbn;
        this.category = category;
        this.numOfBook = numOfBook;
    }
    public int getid() {
        return id;
    }
    public void borrowBook() {
        if (numOfBook > 0) {
            numOfBook--;
        } else {
            System.out.println("No copies available to borrow.");
        }
    }
    public void returnBook() {
        numOfBook++;
    }
}
