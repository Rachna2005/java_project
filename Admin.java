import java.util.HashMap;
import java.util.Map;

public class Admin extends User{
    private static Map<String, Admin> adminDatabase = new HashMap<>(); // Store admin(s)

    // Constructor
    public Admin(String name, String email, String phoneNumber, String password) {
        super(name, email, phoneNumber, password);
    }

    // Predefine the admin in the map
    static {
        adminDatabase.put("admin@gmail.com", new Admin("System Admin", "admin@gamil.com", "123456789", "adminpassword"));
        adminDatabase.put("superadmin@admin.com", new Admin("Super Admin", "superadmin@gmail.com", "987654321", "superpassword"));
    }

    public static void loginAdmin(String email, String password) {
        Admin admin = adminDatabase.get(email);
        if (admin != null && admin.password.equals(password)) {
            System.out.println("Admin login successful! Welcome, " + admin.name);
        } else {
            System.out.println("Invalid email or password.");
        }
    }
    
}