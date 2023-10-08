package model.items.prefabs.gunpowder;

import model.items.Item;
import model.items.Items;
import model.items.aspects.Craftable;

public class HeavyGunpowder extends Item implements Craftable {

    public HeavyGunpowder(int index) {
        super("HG", Items.HEAVY_GUNPOWDER, index, 10);
    }
}
