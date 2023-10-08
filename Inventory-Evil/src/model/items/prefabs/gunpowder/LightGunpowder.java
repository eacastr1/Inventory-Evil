package model.items.prefabs.gunpowder;

import model.items.Item;
import model.items.Items;
import model.items.aspects.Craftable;

public class LightGunpowder extends Item implements Craftable {

    public LightGunpowder(int index) {
        super("LG", Items.LIGHT_GUNPOWDER, index, 5);
    }
}
