package generics.smartwarehouse;

// Concrete class for Electronics
class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String itemId, String name, String brand) {
        super(itemId, name);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand;
    }
}