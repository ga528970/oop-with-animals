class Main {
    public static void main(String[ ] args) {
        // Create a bunch of animals
        var animals = new Animal[] {
            new Cat("Tommy"),
            new Cat("Felix"),
            new Dog("Jerry"),
            new Skunk(),
            new Skunk("Pierre")
        };

        // Let each animal print themselves
        for (var animal: animals) {
            System.out.println(animal);
        }
    }
}