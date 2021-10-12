public interface ISellable {
    // A short description of the item
    String description();

    // The price of one item
    double unitPrice();

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku();
}