package com.library.system.category;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Books> books; // List of books in this category

    // Constructor
    public Category(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the category
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to category '" + name + "': " + book.getTitle());
    }

    // Remove a book from the category by ISBN
    public void removeBook(String ID) {
        for (Book book : books) {
            if (book.getIsbn().equals(ID)) {
                books.remove(book);
                System.out.println("Book removed from category '" + name + "': " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ID " + ID + " not found in category '" + name + "'.");
    }

    // Display all books in the category
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in category '" + name + "'.");
        } else {
            System.out.println("Books in category '" + name + "':");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Getter for category name
    public String getName() {
        return name;
    }
}