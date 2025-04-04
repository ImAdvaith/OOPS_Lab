import recipe.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecipeManager manager = new RecipeManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nRecipe Manager");
            System.out.println("1. Add Recipe");
            System.out.println("2. View All Recipes");
            System.out.println("3. Search Recipe by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter recipe name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter number of ingredients: ");
                    int count = Integer.parseInt(sc.nextLine());

                    Recipe recipe = new Recipe(name, "");

                    for (int i = 0; i < count; i++) {
                        System.out.print("Ingredient " + (i + 1) + " name: ");
                        String ingName = sc.nextLine();
                        System.out.print("Ingredient " + (i + 1) + " quantity: ");
                        String qty = sc.nextLine();

                        Ingredient ingredient = new Ingredient(ingName, qty);
                        recipe.addIngredient(ingredient);
                    }

                    System.out.print("Enter cooking instructions: ");
                    String instructions = sc.nextLine();

                    recipe = new Recipe(name, instructions);
                    for (int i = 0; i < count; i++) {
                        recipe.addIngredient(new Ingredient(sc.nextLine(), sc.nextLine()));
                    }

                    manager.addRecipe(recipe);
                    break;

                case 2:
                    manager.displayAllRecipes();
                    break;

                case 3:
                    System.out.print("Enter recipe name to search: ");
                    String search = sc.nextLine();
                    manager.searchRecipeByName(search);
                    break;

                case 4:
                    System.out.println("Exiting Recipe Manager. Goodbye!");
                    return;

                default:
                    System.out.println("❗ Invalid option.");
            }
        }
    }
}
