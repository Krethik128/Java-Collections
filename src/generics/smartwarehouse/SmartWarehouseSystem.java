package generics.smartwarehouse;

import java.util.ArrayList;
import java.util.List;

class SmartWarehouseSystem {
    // Wildcard method to display all items in any Storage of WarehouseItems
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        System.out.println("--- All Items in Storage ---");
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        // Create storage units for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add electronics items
        electronicsStorage.addItem(new Electronics("E001", "Laptop", "Dell"));
        electronicsStorage.addItem(new Electronics("E002", "Smartphone", "Samsung"));

        // Add groceries items
        groceriesStorage.addItem(new Groceries("G001", "Apples", "2025-05-25"));
        groceriesStorage.addItem(new Groceries("G002", "Milk", "2025-05-22"));

        // Add furniture items
        furnitureStorage.addItem(new Furniture("F001", "Table", "Wood"));
        furnitureStorage.addItem(new Furniture("F002", "Chair", "Metal"));

        // Display all items using the wildcard method
        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.addAll(electronicsStorage.getAllItems());
        allItems.addAll(groceriesStorage.getAllItems());
        allItems.addAll(furnitureStorage.getAllItems());
        displayAllItems(allItems);
    }
}

