public class Medicine {

    private final String name;
    private final String code;
    private double price;
    private int stock;
    private final CategoryOfMedicine category;

    public Medicine(String name, String code, double price, int stock, CategoryOfMedicine category) {
        this.name = name;
        this.code = code;
        this.category = category;
        setPrice(price);
        setStock(stock);
    }

    public String getName() {

        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public int getStock() {

        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock must not be negative");
        }
        this.stock = stock;
    }

    public CategoryOfMedicine getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name=" + name +
                "code=" + code +
                "price=" + price +
                "stock=" + stock +
                "category=" + category +
                "}";
    }
}