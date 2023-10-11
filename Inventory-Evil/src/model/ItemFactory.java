package model;

import model.items.Item;
import model.items.Items;
import model.items.prefabs.herbs.*;

public class ItemFactory {
    public static Item getItem(String id, int idx) throws IllegalArgumentException {
        return switch (id) {
            case "GH" -> new GreenHerb(idx);
            case "RH" -> new RedHerb(idx);
            case "MH" -> new MixedHerb(idx);
            default -> throw new IllegalArgumentException("Invalid id!");
        };
    }
}
