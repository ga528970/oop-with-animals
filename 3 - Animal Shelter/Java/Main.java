import java.util.*;
import java.text.DecimalFormat;

class Main {
    static final DecimalFormat priceFormatter = new DecimalFormat("$###,###.00 Ea");

    public static void main(String[ ] args) {
        // Create a bunch of animals
        var animals = new Animal[] {
            new Cat("Tommy"),
            new Cat("Felix"),
            new Dog("Jerry"),
            new Skunk(),
            new Skunk("Pierre")
        };

        // Initialize an inventory of things that we can sell.  It's just a list of sellable items.
        var inventory = new ArrayList<ISellable>();
        inventory.add(new CatFood());

        // Introduce the animals
        printHeading("Say hello to all our animals in the shelter!");
        for (var animal: animals) {
            System.out.println(animal);

            // If the animal is sellable then we add it to the inventory
            if (animal instanceof ISellable)
                inventory.add((ISellable)animal);
        }

        // List the items for sale
        printHeading("On SALE meow!");
        for (var item: inventory) {
            System.out.println(String.format("%-10s %-35s %10s", 
                item.sku(), item.description(), priceFormatter.format(item.unitPrice())));
        }
    }

    static void printHeading(String headingText) {
        System.out.println();
        System.out.println(headingText);
        System.out.println("-".repeat(58));
    }
}