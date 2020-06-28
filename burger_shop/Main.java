import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    // public static void burgerChoice() {
    //     System.out.println("Choose your burger: ");
    //     System.out.println("1 - Deluxe Burger");
    //     System.out.println("2 - Healthy Burger");
    //     System.out.println("Any other key - Create your Own Burger");
    //     int action = scanner.nextInt();
    //     scanner.nextLine();
    //     switch (action) {
    //         case 1:
    //             System.out.println("You have chosen the Deluxe Burger");
    //             DeluxeBurger aburger = new DeluxeBurger("white");
    //             break;
    //         case 2:
    //             System.out.println("You have chosen the Deluxe Burger");
    //             // DeluxeBurger dburger = new DeluxeBurger("wheat");
    //             break;
    //         default:
    //             Burger burger = new Burger(true);
    //     }
    // }
    public static void meatChoice(Burger burger) {
        // Burger burger = new Burger(true);
        System.out.println("Choose your meat: ");
        System.out.println("1 - Beef");
        System.out.println("2 - Turkey");
        System.out.println("3 - Chicken");
        System.out.println("4 - Steak +$1.00");
        int action = scanner.nextInt();
        scanner.nextLine();

        switch (action) {
            case 1:
                System.out.println("You have chosen Beef");
                Meat beef = new Meat("Beef");
                burger.chooseMeat(beef);
                break;
            case 2:
                System.out.println("You have chosen Turkey");
                Meat turkey = new Meat("Turkey");
                burger.chooseMeat(turkey);
                break;
            case 3:
                System.out.println("You have chosen Chicken");
                Meat chicken = new Meat("Chicken");
                burger.chooseMeat(chicken);
                break;
            case 4:
                System.out.println("You have chosen Steak");
                Meat steak = new Meat("Steak");
                burger.chooseMeat(steak);
                // changePrice(100);
                break;
        }

    }

    public static void breadChoice(Burger burger) {
        System.out.println("Choose your bread: ");
        System.out.println("White");
        System.out.println("Wheat");
        System.out.println("Rye");
        String roll = scanner.nextLine();
        // scanner.nextLine();

        // switch (action) {
        //     case 1:
        //         String roll = "white";
        //     case 2:
        //         String roll = "wheat";
        //     case 3:
        //         String roll = "rye";

        // }
        Bread bread = new Bread(roll);
        burger.chooseBread(bread);
        System.out.println("You have chosen a " + roll + " roll.");
    }

    public static void addToppings(Burger burger) {
        System.out.println("Choose your toppings(first 2 regular toppings are free): ");
        // System.out.println("0 - Quit");
        // System.out.println("1 - Beef");
        // System.out.println("2 - Turkey");
        // System.out.println("3 - Chicken");
        // System.out.println("4 - Steak");
        ArrayList<Topping> toppings = Burger.getAllToppings();
        System.out.println("0 - Finished");
        for (int i = 0; i < toppings.size(); i++) {
            Topping top = toppings.get(i);
            if (i == 5) {
                System.out.println("Gourmet Toppings:");
            }
            if (i < 5) {
                System.out.println((i + 1) + " - " + top.getName());
            } else {
                System.out.println((i + 1) + " - " + top.getName() + " : +$" + (top.getPrice() / 100) + "."
                        + (top.getPrice() % 100));
            }

        }
        boolean active = true;
        while (active) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    active = false;
                    break;
                case 1:
                    burger.addTopping(toppings.get(0));
                    System.out.println("You have added lettuce");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
                case 2:
                    burger.addTopping(toppings.get(1));
                    System.out.println("You have added tomatoes");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
                case 3:
                    burger.addTopping(toppings.get(2));
                    System.out.println("You have added alfafa");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
                case 4:
                    burger.addTopping(toppings.get(3));
                    System.out.println("You have added onions");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
                case 5:
                    burger.addTopping(toppings.get(4));
                    System.out.println("You have added pickles");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
                case 6:
                    burger.addTopping(toppings.get(5));
                    System.out.println("You have added grilled jalepenos");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
                case 7:
                    burger.addTopping(toppings.get(6));
                    System.out.println("You have added guacamole");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
                case 8:
                    burger.addTopping(toppings.get(7));
                    System.out.println("You have added cheese");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
                case 9:
                    burger.addTopping(toppings.get(8));
                    System.out.println("You have added bacon");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
                case 10:
                    burger.addTopping(toppings.get(9));
                    System.out.println("You have added grilled onions");
                    System.out.println("Press 0 if finished or choose another topping");
                    break;
            }
        }

    }

    public void makeMeal(Burger burger) {
        System.out.println("Would you like to make it a meal?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int action = scanner.nextInt();
        scanner.nextLine();
        switch (action) {
            case 1:
                System.out.println("Would you like fries or fruit as your side?");
                System.out.println("1 - Fries");
                System.out.println("2 - Fruit");
                int second = scanner.nextInt();
                scanner.nextLine();
                    Meal meal = new Meal(burger, fries, drink)
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Bob's Burgers. Please choose a burger: ");
        Burger.makeToppings();
        boolean active = true;
        while (active) {
            // System.out.println("Choose your burger: ");
            ArrayList<Topping> toppings = Burger.getAllToppings();
            System.out.println("1 - Create your Burger");
            System.out.println("2 - Deluxe Burger");
            System.out.println("3 - Healthy Burger");
            System.out.println("Any other number - Exit");
            int action = scanner.nextInt();
            scanner.nextLine();
            // System.out.println("Do you want to customize your toppins?");
            // System.out.println("If so type true, else type false");
            // boolean custom = scanner.nextBoolean();
            // scanner.nextLine();
            switch (action) {
                case 2:
                    System.out.println("You have chosen the Deluxe Burger");
                    DeluxeBurger dBurger = new DeluxeBurger();
                    meatChoice(dBurger);
                    breadChoice(dBurger);
                    System.out.println("The Deluxe comes with lettuce, grilled onions, cheese, and bacon");
                    // dBurger.setDeluxeToppings(Burger.lettuce, Burger.gOnion, Burger.cheese, Burger.bacon);                    
                    // dBurger.setDeluxeToppings(toppings.get(0), toppings.get(7), toppings.get(8), toppings.get(9));
                    dBurger.getDeluxePrice();
                    System.out.println("You have chosen the Deluxe Burger");
                    dBurger.getPrice();
                    break;
                case 3:
                    System.out.println("You have chosen the Healthy Burger");
                    HealthBurger hBurger = new HealthBurger();
                    break;
                case 1:
                    System.out.println("You have chosen a Regular Burger");
                    Burger burger = new Burger();
                    meatChoice(burger);
                    breadChoice(burger);
                    burger.totalBurgerPrice();
                    System.out.println("I like burgers");
                    System.out.println(burger);
                    addToppings(burger);
                    burger.totalBurgerPrice();
                    makeMeal();
                    break;
                default:
                    active = false;
            }
            // printSelection();
            // System.out.println("You have chosen a burger with a " + burger.getMeat());

            //Toppings
        }

    }
}
