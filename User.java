public abstract class User {
    private static int idCounter = 0;
    protected int Id ;
    protected String name;
    protected String email;
    protected String phoneNumber;
    private String password; 

    public User( String name, String email, String phoneNumber, String password) {
        this.Id = ++idCounter;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (Id != other.Id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        return true;
    }




    @Override
    public String toString() {
        return "User [Id=" + Id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password="
                + password + "]";
    }




    public void displayUserDetails() {
        System.out.println("User ID: " +Id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
    public boolean verifyPassword(String password){
        return this.password.equals(password);
    }

}
