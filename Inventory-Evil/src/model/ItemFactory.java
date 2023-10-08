package model;

import model.items.Item;
import model.items.Items;
import model.items.prefabs.herbs.*;

public class ItemFactory {
    public static Item getItem(Items name, int index) {
        switch(name) {
            case GREEN_HERB: return new GreenHerb(index);
            case RED_HERB: return new RedHerb(index);
            case SUPER_YELLOW_HERB: return new YellowHerb(index);
        }
        return null;
    }
}
