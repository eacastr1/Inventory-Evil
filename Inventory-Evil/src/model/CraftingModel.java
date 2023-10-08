package model;

import model.items.prefabs.herbs.YellowHerb;

import java.util.HashMap;

public class CraftingModel {
    private HashMap<String, String> recipes = new HashMap<>();

    public CraftingModel() {
        setRecipes();
    }

    private void setRecipes() {
        // add in string ID to get recipes
        // HERB RECIPES
        recipes.put("GHGH", "SGH");
        recipes.put("GHRH", "SYH");
        recipes.put("RHGH", "SYH");
        recipes.put("LGLG", "PA");
        recipes.put("LGHG", "SA");
        recipes.put("HGLG", "SA");
        recipes.put("HGHG", "MA");
    }

    public String getRecipeItemID(String id) {
        return recipes.get(id);
    }
}
