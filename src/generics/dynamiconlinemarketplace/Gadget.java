package generics.dynamiconlinemarketplace;

// --- Gadget.java ---
class Gadget extends Product<GadgetCategory> {
    private String brand;

    public Gadget(String name, double price, GadgetCategory category, String brand) {
        super(name, price, category);
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
