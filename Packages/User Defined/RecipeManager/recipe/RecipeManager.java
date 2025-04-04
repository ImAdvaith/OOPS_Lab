package recipe;

import java.util.ArrayList;

public class RecipeManager {
    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
        System.out.println("✅ Recipe added: " + recipe.getRecipeName());
    }

    public void displayAllRecipes() {
        if (recipes.isEmpty()) {
            System.out.println("❌ No recipes available.");
            return;
        }

        System.out.println("\n📚 All Recipes:");
        for (Recipe r : recipes) {
            r.displayRecipe();
            System.out.println("----------------------");
        }
    }

    public void searchRecipeByName(String name) {
        boolean found = false;
        for (Recipe r : recipes) {
            if (r.getRecipeName().equalsIgnoreCase(name)) {
                r.displayRecipe();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("❌ Recipe not found.");
        }
    }
}
