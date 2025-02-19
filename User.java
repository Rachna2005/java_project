public class User {
    private static int idCounter = 0;
    protected int Id ;
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected String password; 

    public User( String name, String email, String phoneNumber, String password) {
        this.Id = ++idCounter;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    
    public void displayUserDetails() {
        System.out.println("User ID: " +Id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

}
