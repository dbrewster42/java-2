// package burger_shop;

public class Meal {
    private Burger burger;
    private Drink drink;
    private Side side;
    private int price;

    public Meal(Burger burger, Side side, Drink drink) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
        price = burger.totalBurgerPrice();
        // if (drink && (this.side == Side.FRIES || this.side == Side.FRUIT)) {
        if (drink != Drink.WATER && this.side == Side.FRIES) {
            price += 300;
        } else {
            price += side.getPrice();
            price += drink.getPrice();

        }
    }

    public int getMealPrice() {
        return price;
    }

}
