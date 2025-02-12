import java.util.List; // To store the list of books and genres

public class Author {

    static int authorIdCounter = 0; // Static variable to generate unique author IDs
    private int authorId; // Instance variable to hold the author ID
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String biography;
    private List<String> booksWritten; // A list of book titles the author has written
    private List<String> genres; // Genres the author typically writes in
    private String contactInfo; // Email or website for the author
    private List<String> awards; // Any awards or honors received by the author

    // Constructor with name, nationality, dateOfBirth, biography, books, genres, and awards
    public Author(String name, String nationality, String dateOfBirth, String biography,
                  List<String> booksWritten, List<String> genres, String contactInfo, List<String> awards) {
        this.authorId = ++authorIdCounter; // Auto-incrementing unique author ID
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.biography = biography;
        this.booksWritten = booksWritten;
        this.genres = genres;
        this.contactInfo = contactInfo;
        this.awards = awards;
    }

    // Getter for authorId
    public int getAuthorId() {
        return authorId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for nationality
    public String getNationality() {
        return nationality;
    }

    // Getter for date of birth
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // Getter for biography
    public String getBiography() {
        return biography;
    }

    // Getter for books written
    public List<String> getBooksWritten() {
        return booksWritten;
    }

    // Getter for genres
    public List<String> getGenres() {
        return genres;
    }

    // Getter for contact info
    public String getContactInfo() {
        return contactInfo;
    }

    // Getter for awards
    public List<String> getAwards() {
        return awards;
    }

    // Method to display author details
    public void displayAuthorInfo() {
        System.out.println("Author ID: " + authorId);
        System.out.println("Name: " + name);
        System.out.println("Nationality: " + nationality);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Biography: " + biography);
        System.out.println("Books Written: " + String.join(", ", booksWritten));
        System.out.println("Genres: " + String.join(", ", genres));
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Awards: " + String.join(", ", awards));
    }
}


