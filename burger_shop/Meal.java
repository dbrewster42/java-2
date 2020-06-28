// package burger_shop;

public class Meal {
    private Burger burger;
    private Drink drink;
    private Side side;
    private int price;
    private Side[] sides = new Side[3];
    private int i = 1;

    public Meal(Burger burger, Side side, Drink drink) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
        sides[0] = side;
        price = burger.totalBurgerPrice();
        // if (drink && (this.side == Side.FRIES || this.side == Side.FRUIT)) {
        if (drink != Drink.WATER && this.side == Side.FRIES) {
            price += 300;
        } else {
            if (side != null)
                price += side.getPrice();
            if (drink != null)
                price += drink.getPrice();

        }
    }

    public int getMealPrice() {
        System.out.println("The current total of your meal is $" + (price / 100) + "." + (price % 100));
        return price;
    }

    public boolean addSide(Side side) {
        if (i < 3) {
            sides[i] = side;
            i++;
            price += side.getPrice();
            return true;
        } else {
            System.out.println("Sorry but we were unable to add your " + side.getName()
                    + ". Each meal has a max of 3 sides. Please create a new meal if you want more sides");
            return false;
        }
    }

}
