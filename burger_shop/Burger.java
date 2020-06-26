
// package burger_shop;
import java.util.ArrayList;

public class Burger {
    // private Bread roll = new Bread();
    // private Meat meat = new Meat();
    private Bread bread;
    // public String breadName;
    private Meat meat;
    private static final int price = 699;
    private int newPrice = 699;
    private static ArrayList<Topping> allToppings = new ArrayList<Topping>();
    // private static Topping[] allToppings = new Topping[10];
    private ArrayList<Topping> toppings = new ArrayList<Topping>();
    // private ArrayList<String> customBurger = new ArrayList<String>();    

    // public Burger(boolean customize) {
    public Burger() {
        // if (first)
        //     makeToppings();
        // if (customize) {
        //     addTopping();
        // }
    }

    // customTopping(){
    //     addTopping("lettuce");
    // }

    public void addTopping(Topping topping) {
        int priceChange = topping.getPrice();
        newPrice += priceChange;
        if (toppings.size() < 2) {
            newPrice -= 50;
        }
        toppings.add(topping);
    }

    public static void makeToppings() {
        // first = false;
        Topping lettuce = new Topping("lettuce");
        Topping tomatoes = new Topping("tomatoes");
        Topping alfafa = new Topping("alfafa");
        Topping onions = new Topping("onions");
        Topping pickles = new Topping("pickles");
        Topping jalepenos = new Topping("grilled jalepenos", 100);
        Topping guacamole = new Topping("guacamole", 200);
        Topping cheese = new Topping("cheese", 100);
        Topping bacon = new Topping("bacon", 150);
        Topping gOnions = new Topping("grilled onions", 100);
        allToppings.add(lettuce);
        allToppings.add(tomatoes);
        allToppings.add(alfafa);
        allToppings.add(onions);
        allToppings.add(pickles);
        allToppings.add(jalepenos);
        allToppings.add(guacamole);
        allToppings.add(cheese);
        allToppings.add(bacon);
        allToppings.add(gOnions);
    }

    public static ArrayList getAllToppings() {
        // (Topping i : allToppings ){
        //     System.out.println(i.getName());
        // }
        return allToppings;

    }

    public Meat chooseMeat(String name) {
        // public void chooseMeat(String name) {
        if (name.equals("Steak")) {
            newPrice += 100;
        }
        this.meat = new Meat(name);
        // String meatName = name;
        // customBurger.add(name);
        return meat;
    }

    // public Meat getMeat(){
    //     return 
    // }

    public Bread chooseBread(String name) {
        this.bread = new Bread(name);
        // breadName += name;
        // customBurger.add(name);
        return bread;
    }

    public int totalBurgerPrice() {
        // String meatType = this.meat.getName();
        // Bread breadType = bread.name;
        System.out.println("You have ordered a burger with " + meat.getMeat() + " for $" + (this.newPrice / 100) + "."
                + (this.newPrice % 100));
        // System.out.println("You have ordered a burger with " + meat.getMeat() + " on a " + bread.name + " bun for $"
        // + (this.newPrice / 100) + "." + (this.newPrice % 100));
        return this.newPrice;
    }

    public int plainBurgerPrice() {
        return price;
    }
}
