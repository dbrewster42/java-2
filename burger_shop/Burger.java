
// package burger_shop;
import java.util.ArrayList;

public class Burger {
    // private Bread roll = new Bread();
    // private Meat meat = new Meat();
    private Bread bread;
    private Meat meat;
    private static final int price = 699;
    private int newPrice = 699;
    private static ArrayList<Topping> allToppings = new ArrayList<Topping>();
    // private static Topping[] allToppings = new Topping[10];
    private ArrayList<Topping> toppings = new ArrayList<Topping>();

    public Burger() {

    }

    public void addTopping(Topping topping) {
        int priceChange = topping.getPrice();
        toppings.add(topping);
        if (toppings.size() < 3) {
            priceChange -= 50;
        }
        newPrice += priceChange;
    }

    public static void makeToppings() {
        // Topping lettuce = new Topping("lettuce");
        // Topping tomatoes = new Topping("tomatoes");
        // Topping alfafa = new Topping("alfafa");
        // Topping onions = new Topping("onions");
        // Topping pickles = new Topping("pickles");
        // Topping jalepenos = new Topping("grilled jalepenos", 100);
        // Topping guacamole = new Topping("guacamole", 200);
        // Topping cheese = new Topping("cheese", 100);
        // Topping bacon = new Topping("bacon", 150);
        // Topping gOnions = new Topping("grilled onions", 100);
        allToppings.add(Topping.Lettuce);
        allToppings.add(Topping.Tomatoes);
        allToppings.add(Topping.Alfafa);
        allToppings.add(Topping.Onions);
        allToppings.add(Topping.Pickles);
        allToppings.add(Topping.Jalepenos);
        allToppings.add(Topping.Guacamole);
        allToppings.add(Topping.Cheese);
        allToppings.add(Topping.Bacon);
        allToppings.add(Topping.GOnions);
    }

    // public static ArrayList getAllToppings() {
    //     // (Topping i : allToppings ){
    //     //     System.out.println(i.getName());
    //     // }
    //     return allToppings;

    // }
    public static ArrayList<Topping> getAllToppings() {
        return allToppings;
    }

    public void chooseMeat(Meat meatType) {
        // public void chooseMeat(String name) {
        if (meatType.getMeat().equals("Steak")) {
            newPrice += 100;
        }
        this.meat = meatType;
        // String meatName = name;
        // customBurger.add(name);
        // return meat;
    }

    // public Meat getMeat(){
    //     return 
    // }

    public void chooseBread(Bread roll) {
        this.bread = roll;
        // breadName += name;
        // customBurger.add(name);
        // return bread;
    }

    public int totalBurgerPrice() {
        String tops = "";
        for (Topping i : toppings) {
            tops = tops + i.getName() + " ";
        }
        // String meatType = this.meat.getName();
        // Bread breadType = bread.name;
        // System.out.println("You have ordered a burger with " + meat.getMeat() + " for $" + (this.newPrice / 100) + "."
        //         + (this.newPrice % 100));
        System.out.println("You have ordered a burger with " + this.meat.getMeat() + " on a " + this.bread.getBread()
                + " bun with " + tops + "for $" + (this.newPrice / 100) + "." + (this.newPrice % 100));
        return this.newPrice;
    }

    public int plainBurgerPrice() {
        return price;
    }
}
