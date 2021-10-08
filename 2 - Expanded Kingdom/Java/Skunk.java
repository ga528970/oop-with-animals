public class Skunk extends Animal {
    // Default constructor
    public Skunk() {
        super();
    }

    // A Constructor that takes a name for the animal
    public Skunk(String name) {
        super(name);
    }

    public String species() {
        return "Skunk";
    }

    public int numberOfLegs() {
        return 4;
    }

    public String toString() {
        return String.format("Hi, I'm %s, a %s.", this.name(), this.species());
    }
}