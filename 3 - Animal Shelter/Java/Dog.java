public class Dog extends DomesticatedAnimal {
    public Dog(String name) {
        super(name);
    }

    public String species() {
        return "Dog";
    }

    public int numberOfLegs() {
        return 4;
    }

    public String description() {
        return String.format("Canis lupus familiaris (%s)", this.name());
    }

    public double unitPrice() {
        return 245.99;
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "dog0001";
    }
}