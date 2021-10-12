public class Cat extends DomesticatedAnimal {
    public Cat(String name) {
        super(name);
    }

    public String species() {
        return "Cat";
    }

    public int numberOfLegs() {
        return 4;
    }

    public String description() {
        return String.format("Felis catus (%s)", this.name());
    }

    public double unitPrice() {
        return 124;
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "cat0001";
    }
}