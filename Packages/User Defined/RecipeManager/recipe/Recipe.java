package recipe;

import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private ArrayList<Ingredient> ingredients;
    private String instructions;

    public Recipe(String recipeName, String instructions) {
        this.recipeName = recipeName;
        this.instructions = instructions;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void displayRecipe() {
        System.out.println("\n Recipe: " + recipeName);
        System.out.println(" Ingredients:");
        for (Ingredient i : ingredients) {
            i.displayIngredient();
        }
        System.out.println(" Instructions: " + instructions);
    }
}
