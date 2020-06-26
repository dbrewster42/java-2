import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    private Bread bread;
    private Meat meat;
    private ArrayList<Topping> toppings = new ArrayList<Topping>();
    private int price = 999;

    // public DeluxeBurger(boolean custom) {
    public DeluxeBurger() {
        // Bread bread = new Bread("White");
        // Meat meat = new Meat("Beef");
        // int price = 899;
        // ArrayList<Topping> toppings = new ArrayList<Topping>();
    }
    // if (custom) {
    //     super.addTopping();
    // } else {
    //     toppings.add(lettuce);
    //     // toppings.add("onion");
    //     // toppings.add("cheese");
    //     // toppings.add("bacon");

    // }
    // public DeluxeBurger(Topping top, Topping top2, Topping top3, Topping top4) {      
    //     toppings.add(top);
    //     toppings.add(top2);
    //     toppings.add(top3);
    //     toppings.add(top4);

    public int getDeluxePrice() {
        System.out.println("You have ordered a Deluxe Burger with " + meat.getMeat() + " for $" + (price / 100) + "."
                + (price % 100));
        return price;
    }

    public void setDeluxeToppings(Topping top, Topping top2, Topping top3, Topping top4) {
        toppings.add(top);
        toppings.add(top2);
        toppings.add(top3);
        toppings.add(top4);
    }

    public Meat chooseMeat(String name) {
        meat = super.chooseMeat(name);
        return meat;
    }

}
