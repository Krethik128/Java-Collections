package generics.dynamiconlinemarketplace;

// --- Clothing.java ---
class Clothing extends Product<ClothingCategory> {
    private String size;

    public Clothing(String name, double price, ClothingCategory category, String size) {
        super(name, price, category);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size;
    }
}