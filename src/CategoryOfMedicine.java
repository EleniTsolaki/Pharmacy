public class CategoryOfMedicine {
    private final String categoryName;

    public CategoryOfMedicine(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "CategoryOfMedicine{" +
                "categoryName=" + categoryName +
                '}';
    }

}
