public class Book {
    public static int id = 0;
    public String title;
    public String author;
    public int publishedYear;
    public String isbn;
    public String category;
    public int numOfBook;
    Book ( String title, String author, int publishedYear, int numOfBook, String isbn, String category){
        id = id + 1;
        this.title = title ;
        this.author = author;
        this.publishedYear = publishedYear ;
        this.isbn = isbn;
        this.category = category;
    }
    
    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Book ID: " + id);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("ISBN: " + isbn);
        System.out.println("Published Year: " + publishedYear);
        System.out.println("Available : " + numOfBook);
    }

   

}
