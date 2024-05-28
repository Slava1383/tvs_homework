import java.util.List;

public class Product {
    private String name;
    private double price;
    private Category category;
    private boolean delivery;
    private List<Store> storeList;
    private Manufacturer manufacturer;

    public Product(String name, double price, Category category, boolean delivery, List<Store> storeList, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.delivery = delivery;
        this.storeList = storeList;
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", delivery=" + delivery +
                ", storeList=" + storeList +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
