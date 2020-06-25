
// package burger_shop;
import java.util.ArrayList;

public class Burger {
    // private Bread roll = new Bread();
    // private Meat meat = new Meat();
    private Bread roll;
    private Meat meat;
    private int price = 699;
    private int newPrice = price;
    ArrayList<Topping> toppings = new ArrayList<Topping>();
    // String[] toppings = { "lettuce", "tomatoes", "alfalfa", "onions", "pickles", "jalepenos", "guacamole", "cheese",
    //         "bacon" };

    public Burger(boolean customize) {
        if (customize) {
            addTopping();
        }
    }

    // customTopping(){
    //     addTopping("lettuce");
    // }
    public void addToppings() {
        Topping lettuce = new Topping("lettuce");
        Topping tomatoes = new Topping("tomatoes");
        Topping alfafa = new Topping("alfafa");
        Topping onions = new Topping("onions");
        Topping pickles = new Topping("pickles");
        Topping jalepenos = new Topping("grilled jalepenos", 50);
        Topping guacamole = new Topping("guacamole", 200);
        Topping cheese = new Topping("cheese", 100);
        Topping bacon = new Topping("bacon", 150);
        Topping gOnions = new Topping("grilled onions", 50);
        toppings.add(lettuce);
        toppings.add(tomatoes);
        toppings.add(alfafa);
        toppings.add(onions);
    }

    public Meat chooseMeat(String name) {
        if (name.equals("Steak")) {
            newPrice += 100;
        }
        Meat meat = new Meat(name);
        return meat;
    }

    public Bread chooseBread(String name) {
        Bread bread = new Bread(name);
        return bread;
    }

    public int totalBurgerPrice() {
        return this.newPrice;
    }

    public int plainBurgerPrice() {
        return price;
    }
}
