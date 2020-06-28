import java.util.ArrayList;

public class Order {
    private Meal meal;
    private ArrayList<Meal> meals = new ArrayList<Meal>();

    public Order(Meal meal) {
        this.meal = meal;

    }

    public void addMeal(Meal meal) {
        Meal newMeal = meal;
        meals.add(newMeal);
    }
}
