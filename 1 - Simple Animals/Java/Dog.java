public class Dog {
    private String _name;

    public Dog(String name) {
        this._name = name;
    }

    public String species() {
        return "Dog";
    }

    public int numberOfLegs() {
        return 4;
    }

    // The given (pet) name of the animal
    public String name() {
        return this._name;
    }

    public double unitPrice() {
        return 245.99;
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "dog0001";
    }

    public String toString() {
        return String.format("Hi, I'm %s, a %s.", this.name(), this.species());
    }
}