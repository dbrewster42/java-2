import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private boolean active;

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

    public static void meatChoice() {
        Burger burger = new Burger(true);
        System.out.println("Choose your meat: ");
        System.out.println("1 - Beef");
        System.out.println("2 - Turkey");
        System.out.println("3 - Chicken");
        System.out.println("4 - Steak");
        int action = scanner.nextInt();
        scanner.nextLine();

        switch (action) {
            case 1:
                System.out.println("You have chosen Beef");
                break;
            case 2:
                System.out.println("You have chosen Turkey");
                burger.chooseMeat("Turkey");
                break;
            case 3:
                System.out.println("You have chosen Chicken");
                burger.chooseMeat("Chicken");
                break;
            case 4:
                System.out.println("You have chosen Steak");
                burger.chooseMeat("Steak");
                // changePrice(100);
                break;
        }

    }

    public static void breadChoice() {
        Bread bread = new Bread("white");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Bob's Burgers. Please choose a burger: ");

        active = true;
        while (active) {
            // System.out.println("Choose your burger: ");

            System.out.println("1 - Deluxe Burger");
            System.out.println("2 - Healthy Burger");
            System.out.println("Any other key - Create your Own Burger");
            int action = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Do you want to customize your toppins?");
            System.out.println("If so type true, else type false");
            boolean custom = scanner.nextBoolean();
            scanner.nextLine();
            switch (action) {
                case 1:
                    System.out.println("You have chosen the Deluxe Burger");
                    DeluxeBurger aburger = new DeluxeBurger(custom);
                    break;
                case 2:
                    System.out.println("You have chosen the Healthy Burger");
                    // DeluxeBurger dburger = new DeluxeBurger("wheat");
                    break;
                default:
                    Burger burger = new Burger(custom);
            }

            meatChoice();
            breadChoice();
            //Toppings
        }

    }
}
