
// package burger_shop;
import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(boolean custom) {
        // super();
        if (custom) {
            super.addToppings();
        }
        Bread bread = new Bread(breadName);
        Meat meat = new Meat("Beef");
        int price = 899;
        // ArrayList<String> toppings = new ArrayList<String>();
        ArrayList<Topping> toppings = new ArrayList<Topping>();
        // toppings.add(lettuce);
        // toppings.add("onion");
        // toppings.add("cheese");
        // toppings.add("bacon");

    }
}
