public class User {

    static int userIdCounter = 0; 
    private int userId; 
    private String name;
    private int phoneNumber;
    private String email;
    private String position;

    // Constructor with name, phone number, email, and position
    public User(String name, int phoneNumber, String email, String position) {
        this.userId = ++userIdCounter; 
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.position = position;
    }

    // Getter for userId
    public int getUserId() {
        return userId;
    }

    // Method to display user details
    public void displayUserInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Position: " + position);
    }

}
