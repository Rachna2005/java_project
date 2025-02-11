// import java.util.Date;
public class Transaction {
    int transactionId;
    int userId;
    int bookId;
    // Date borrow_Date;
    // Date dueDate;
    // Date returnDate;
    Transaction(int transactionId, int userId, int bookId) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.bookId = bookId;
        // borrowDate = borrow_Date;
        // dueDate = calculateDueDate(borrowDate, 14); 
        // returnDate = null; 
    }

}
