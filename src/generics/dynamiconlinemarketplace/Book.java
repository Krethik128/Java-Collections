package generics.dynamiconlinemarketplace;

// --- Book.java ---
class Book extends Product<BookCategory> {
    private String author;

    public Book(String name, double price, BookCategory category, String author) {
        super(name, price, category);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}
