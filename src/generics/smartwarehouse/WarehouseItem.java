package generics.smartwarehouse;

// Abstract base class for all warehouse items
abstract class WarehouseItem {
    private String itemId;
    private String name;

    public WarehouseItem(String itemId, String name) {
        this.itemId = itemId;
        this.name = name;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (ID: " + itemId + ")";
    }
}

