package generics.dynamiconlinemarketplace;

// --- ProductCatalog.java ---
import java.util.ArrayList;
import java.util.List;

class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        this.products.add(product);
    }

    public List<Product<?>> getProducts() {
        return products;
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(newPrice);
        System.out.println("Discount of " + percentage + "% applied to " + product.getName() + ". New price: $" + newPrice);
    }

    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Book book1 = new Book("The Lord of the Rings", 25.0, BookType.FICTION, "J.R.R. Tolkien");
        Book book2 = new Book("Pride and Prejudice", 15.0, BookType.FICTION, "Jane Austen");
        Clothing shirt1 = new Clothing("T-Shirt", 20.0, ClothingType.SHIRT, "M");
        Clothing pants1 = new Clothing("Jeans", 50.0, ClothingType.PANTS, "32");
        Gadget phone1 = new Gadget("iPhone 15", 1000.0, GadgetType.PHONE, "Apple");
        Gadget laptop1 = new Gadget("MacBook Pro", 2000.0, GadgetType.LAPTOP, "Apple");

        catalog.addProduct(book1);
        catalog.addProduct(book2);
        catalog.addProduct(shirt1);
        catalog.addProduct(pants1);
        catalog.addProduct(phone1);
        catalog.addProduct(laptop1);

        System.out.println("--- Initial Product Catalog ---");
        for (Product<?> product : catalog.getProducts()) {
            System.out.println(product);
        }

        applyDiscount(book1, 10.0);
        applyDiscount(shirt1, 20.0);
        applyDiscount(laptop1, 5.0);

        System.out.println("\n--- Product Catalog After Discounts ---");
        for (Product<?> product : catalog.getProducts()) {
            System.out.println(product);
        }
    }
}
