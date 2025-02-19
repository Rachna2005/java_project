import java.util.Date;

public class Transaction {
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
    

    public int gettransactionId() {
        return transactionId;
    }

}
