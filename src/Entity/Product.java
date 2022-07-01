package Entity;

public class Product extends BaseRow{
    private double price;
    private double quality;
    private int categoryId;

    public Product(double price, double quality, int categoryId) {
        this.price = price;
        this.quality = quality;
        this.categoryId = categoryId;
    }

    public Product(int id, String name, double price, double quality, int categoryId) {
        super(id, name);
        this.price = price;
        this.quality = quality;
        this.categoryId = categoryId;
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
