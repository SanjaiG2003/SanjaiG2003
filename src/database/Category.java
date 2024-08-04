package database;

// data model to represent dat from category table
public class Category {
    private int categoryId;
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }
}