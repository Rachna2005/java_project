public class Category {
    private static int categoryIdCounter = 0;
    private int categoryId;
    private String name;
    private String description;

    public Category(String name, String description) {
        this.categoryId = ++categoryIdCounter;
        this.name = name;
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Category ID: " + categoryId + ", Name: " + name + ", Description: " + description;
    }
}