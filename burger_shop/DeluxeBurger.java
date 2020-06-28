import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    private Bread bread;
    private Meat meat;
    private ArrayList<Topping> toppings = new ArrayList<Topping>();
    private int price = 999;
    // private int newPrice = 999;

    // public DeluxeBurger(boolean custom) {
    public DeluxeBurger() {
        toppings.add(Topping.Lettuce);
        toppings.add(Topping.Tomatoes);
        toppings.add(Topping.Pickles);
        toppings.add(Topping.Cheese);
        toppings.add(Topping.Bacon);
        toppings.add(Topping.GOnions);
    }

    // public int getDeluxePrice() {
    //     // System.out.println("You have ordered a Deluxe Burger with " + meat.getMeat() + " for $" + (price / 100) + "."
    //     //         + (price % 100));
    //     String tops = "";
    //     for (Topping i : toppings) {
    //         tops = tops + i.getName() + " ";
    //     }
    //     System.out
    //             .println("The Deluxe Burger comes with " + tops + "and costs $" + (price / 100) + "." + (price % 100));
    //     return price;
    //     System.out.println("You have ordered a burger with " + this.meat.getMeat() + " for $" + (this.newPrice / 100)
    //             + "." + (this.newPrice % 100));
    // }

    public int getPrice() {
        // System.out.println("You have ordered a burger for $" + (this.newPrice / 100) + "." + (this.newPrice % 100));
        System.out.println("You have ordered a Deluxe Burger for $" + (price / 100) + "." + (price % 100));
        return price;
    }

    // public void setDeluxeToppings(Topping top, Topping top2, Topping top3, Topping top4) {
    //     toppings.add(top);
    //     toppings.add(top2);
    //     toppings.add(top3);
    //     toppings.add(top4);
    // }

    public void chooseMeat(Meat meatType) {
        super.chooseMeat(meatType);
        // meat = super.chooseMeat(name);
        // return meat;
    }
    // public 

}
