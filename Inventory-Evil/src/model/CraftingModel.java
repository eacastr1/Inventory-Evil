package model;

import java.util.HashMap;

public class CraftingModel {
    private HashMap<String, String> recipes = new HashMap<>();

    public CraftingModel() {
        setRecipes();
    }

    private void setRecipes() {
        // add in string ID to get recipes
        // HERB RECIPES
        recipes.put("GHGH", "MGH");
        recipes.put("GHRH", "MH");
        recipes.put("RHGH", "MH");
        recipes.put("LGLG", "PA");
        recipes.put("LGHG", "SA");
        recipes.put("HGLG", "SA");
        recipes.put("HGHG", "MA");
    }

    public String getRecipeItemID(String id) throws IllegalArgumentException {
        if(recipes.containsKey(id)) {
            return recipes.get(id);
        } else {
            throw new IllegalArgumentException("Invalid id!");
        }
    }
}
