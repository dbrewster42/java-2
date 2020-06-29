import java.util.ArrayList;

public class Order {
    private Meal meal;
    private ArrayList<Meal> meals = new ArrayList<Meal>();
    int price;

    public Order(Meal meal) {
        this.meal = meal;
        price = this.meal.getMealPrice();
    }

    public void addMeal(Meal meal) {
        Meal newMeal = meal;
        meals.add(newMeal);
        price += newMeal.getMealPrice();
    }

    public int getTotalPrice() {
        System.out.println("The total price of your order is $" + (price / 100) + "." + (price % 100));
        return price;
    }
}
