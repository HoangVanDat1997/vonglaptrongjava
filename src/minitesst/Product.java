package minitesst;

public class Product {
    private String name;
    private int price; // Giá Bán
    private String description; // Sự mô tả

    public Product(String name, int price, String description) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        name = "lolo";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
