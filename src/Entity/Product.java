package Entity;

public class Product extends BaseRow {
    private double price;
    private double quality;
    private int categoryId;

    /**
     * create constructor product (price, quality, categegoryId)
     *
     * @param price
     * @param quality
     * @param categoryId
     */
    public Product(double price, double quality, int categoryId) {
        this.price = price;
        this.quality = quality;
        this.categoryId = categoryId;
    }

    /**
     * create constructor product (id , name, price, double, category)
     *
     * @param id
     * @param name
     * @param price
     * @param quality
     * @param categoryId
     */
    public Product(int id, String name, double price, double quality, int categoryId) {
        super(id, name);
        this.price = price;
        this.quality = quality;
        this.categoryId = categoryId;
    }

    /**
     * get data price to model Product
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * set data by price of Product
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * get data quality to model Product
     *
     * @return quality
     */
    public double getQuality() {
        return quality;
    }

    /**
     * set data by quality of Product
     *
     * @param quality
     */
    public void setQuality(double quality) {
        this.quality = quality;
    }

    /**
     * get data categoryId to model Product
     *
     * @return
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * set data by categoryId of Product
     *
     * @param categoryId
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
