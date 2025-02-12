import java.util.Date;

public class Transaction implements borrow_return {
    static int transactionId = 0;
    int userId;
    int bookId;
    Date borrowDate;
    Date dueDate;
    Date returnDate;

    Transaction( int userId, int bookId, Date borrowDate) {
        transactionId = transactionId + 1;
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;

        // Add 14 days to borrowDate to calculate dueDate
        this.dueDate = new Date(borrowDate.getTime() + (14L * 24 * 60 * 60 * 1000)); // 14 days in milliseconds

        this.returnDate = null;
    }
    

    @Override
    public void borrowBook() {
        
        System.out.println("Transaction " + transactionId + ": Book ID " + bookId + " borrowed by User ID " + userId);
    }


    @Override
    public void returnBook() {
        if (returnDate == null) {
            returnDate = new Date(); // Set the return date to today
            System.out.println("Transaction " + transactionId + ": Book ID " + bookId + " returned by User ID " + userId);
        } else {
            System.out.println("This book has already been returned.");
        }
        
    }

    public int gettransactionId() {
        return transactionId;
    }

}
