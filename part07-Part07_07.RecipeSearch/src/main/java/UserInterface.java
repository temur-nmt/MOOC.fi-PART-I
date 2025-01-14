import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipeList;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipeList = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<String> ingredients = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {

                String line = reader.nextLine();

                if (!line.isEmpty()) {
                    ingredients.add(line);
                } else {
                    assignRecipe(recipeList, ingredients);
                }

            }
            if (!ingredients.isEmpty()) {
                assignRecipe(recipeList, ingredients);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println('\n' + "Commands: " + '\n' + "list - lists the recipes" + '\n' + "stop - stops the program"
                + '\n' + "find name - searches recipes by name" + '\n'
                + "find cooking time - searches recipes by cooking time" + '\n'
                + "find ingredient - searches recipes by ingredient" + '\n');

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }
            if (input.equals("list")) {
                System.out.println();
                for (Recipe x : recipeList) {
                    System.out.println(x);
                }
                System.out.println();
            }
            if (input.equals("find name")) {
                System.out.print("Searched word: ");
                String search = scanner.nextLine();
                System.out.println();

                ArrayList<Recipe> tmpName = new ArrayList<>();

                for (Recipe x : recipeList) {
                    if (x.getName().contains(search)) {
                        tmpName.add(x);
                    }
                }
                System.out.println("Recipes: ");

                for (Recipe i : tmpName) {
                    System.out.println(i);
                }
                System.out.println();
            }
            if (input.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println();

                ArrayList<Recipe> tmpCookingTime = new ArrayList<>();

                for (Recipe x : recipeList) {
                    if (x.getTime() <= maxCookingTime) {
                        tmpCookingTime.add(x);
                    }
                }
                System.out.println("Recipes: ");

                for (Recipe i : tmpCookingTime) {
                    System.out.println(i);
                }
                System.out.println();
            }
            if (input.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println();

                ArrayList<Recipe> tmpIngr = new ArrayList<>();

                for (Recipe x : recipeList) {
                    if (x.getIngredients().contains(ingredient)) {
                        tmpIngr.add(x);
                    }
                }
                System.out.println("Recipes: ");

                for (Recipe i : tmpIngr) {
                    System.out.println(i);
                }
                System.out.println();
            }
            if (input.equals("print")) {
                for (Recipe x : recipeList) {
                    System.out.println(x.getIngredients());
                }
            }
        }

    }

    public void assignRecipe(ArrayList<Recipe> recipeList, ArrayList<String> ingredients) {
        String name = ingredients.get(0);
        int time = Integer.valueOf(ingredients.get(1));

        // System.out.println(ingredients);

        ingredients.remove(0);
        ingredients.remove(0);

        recipeList.add(new Recipe(name, time, new ArrayList<>(ingredients)));
        // System.out.println(ingredients);

        ingredients.clear();
    }
}
