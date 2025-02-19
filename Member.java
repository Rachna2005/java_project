import java.util.HashMap;
import java.util.Map;

public class Member extends User {
    private static Map<String, Member> memberDatabase = new HashMap<>(); // Store registered members

    public Member( String name, String email, String phoneNumber, String password) {
        super( name, email, phoneNumber, password);
    }

    public void register() {
        if (memberDatabase.containsKey(email)) {
            System.out.println("Registration failed! Email is already registered.");
            return;
        }
        memberDatabase.put(this.email, this);

        System.out.println("Registration successful! You can now log in.");
    }

    // Member login
    public void login(String email, String password) {
        Member member = memberDatabase.get(email);

        if (member != null && member.password.equals(password)) {
            System.out.println("Login successful! Welcome, " + member.name);
            
        } else {
            System.out.println("Invalid email or password.");
        }
    }
    
}

