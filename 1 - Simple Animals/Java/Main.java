class Main {
    public static void main(String[ ] args) {
        var tommy = new Cat("Tommy");
        var jerry = new Dog("Jerry");
        var pierre = new Skunk();

        System.out.println(tommy);
        System.out.printf("I have %d legs and I cost $%f.\n", tommy.numberOfLegs(), tommy.unitPrice());

        System.out.println(jerry);
        System.out.println(pierre);
    }
}