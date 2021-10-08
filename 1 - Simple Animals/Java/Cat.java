public class Cat {
    private String _name;

    public Cat(String name) {
        this._name = name;
    }

    public String species() {
        return "Cat";
    }

    public int numberOfLegs() {
        return 4;
    }

    // The given (pet) name of the animal
    public String name() {
        return this._name;
    }

    public double unitPrice() {
        return 124.99;
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "cat0001";
    }

    public String toString() {
        return String.format("Hi, I'm %s, a %s.", this.name(), this.species());
    }
}