public class Book implements borrow_return{
    
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
    


    @Override
    public void borrowBook() {
        
        if (numOfBook > 0) {
            numOfBook--;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println("No copies available.");
        }
    }


    @Override
    public void returnBook() {
        numOfBook++;
        System.out.println("Returned: " + title);
    }

    public int getid() {
        return id;
    }
    
}
