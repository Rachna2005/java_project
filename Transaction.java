import java.util.Date;
public class Transaction {
    int transactionId;
    int userId;
    int bookId;
    Date borrowDate;
    Date dueDate;
    Date returnDate;

    Transaction(int transactionId, int userId, int bookId, Date borrowDate) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;

        // Add 14 days to borrowDate to calculate dueDate
        this.dueDate = new Date(borrowDate.getTime() + (14L * 24 * 60 * 60 * 1000)); // 14 days in milliseconds

        this.returnDate = null; // Initially, returnDate is null
    }

}
