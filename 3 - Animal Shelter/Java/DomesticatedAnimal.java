public abstract class DomesticatedAnimal extends Animal implements ISellable {
    public DomesticatedAnimal(String name) {
        super(name);
    }

    public abstract double unitPrice();

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public abstract String sku();

    public String toString() {
        return String.format("%s %s.", super.toString(), "Domesticated");
    }
}