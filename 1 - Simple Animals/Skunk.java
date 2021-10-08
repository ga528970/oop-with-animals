public class Skunk {
    private String _name;

    // Default constructor
    public Skunk() {
        this._name = "un-named";
    }

    // A Constructor that takes a name for the animal
    public Skunk(String name) {
        this._name = name;
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