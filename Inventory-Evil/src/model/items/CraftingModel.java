package model.items;

import java.util.HashMap;

public class CraftingModel {
    private HashMap<String, Item> recipes = new HashMap<>();

    public CraftingModel() {
        setRecipes();
    }

    public void setRecipes() {
        // add in string ID to get recipes
    }

    public Item getCraftedItem(String id) {
        return recipes.get(id);
    }
}
