package Entity;

public class Product {
    private int id;
    private String name;
    private double price;
    private double quality;
    private int categoryId;

    public Product(){}

    public Product(int id, String name, double price, double quality, int categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
