// package burger_shop;

public class Meal {
    private Burger burger;
    private Drink drink;
    private Side side;
    private int price;

    public Meal(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
        price = burger.totalBurgerPrice();
        if (drink && (this.side == Side.FRIES || this.side == Side.FRUIT)) {
            price += 300;
        } else {
            price += side.getPrice();
            price += drink.getPrice();

        }
    }

}
