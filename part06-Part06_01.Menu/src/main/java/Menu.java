
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here

    public void addMeal(String meal) {

        boolean mealExists = false;

        for (String i : meals) {
            if (i.equals(meal)) {
                mealExists = true;
            }
        }

        if (!mealExists) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String i : meals) {
            System.out.println(i);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }
}
