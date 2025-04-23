package generics.smartwarehouse;

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String itemId, String name, String material) {
        super(itemId, name);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}

