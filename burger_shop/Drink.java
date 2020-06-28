// package burger_shop;

public class Drink {
    private String name;
    private int price;
    final public static Drink COKE = new Drink("coke");
    final public static Drink DRP = new Drink("dr pepper");
    final public static Drink TEA = new Drink("tea");
    final public static Drink SPRITE = new Drink("sprite");
    final public static Drink DIET = new Drink("diet coke");
    final public static Drink WATER = new Drink("water");

    private Drink(String name) {
        this.name = name;
        if (name == "water")
            price = 0;
        else
            price = 200;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return price;
    }
}