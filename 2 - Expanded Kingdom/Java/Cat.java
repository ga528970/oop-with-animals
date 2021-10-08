public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public String species() {
        return "Cat";
    }

    public int numberOfLegs() {
        return 4;
    }

    public double unitPrice() {
        return 124.99;
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "cat0001";
    }
}