package model.items.prefabs.gunpowder;

import model.items.Item;
import model.items.Types;
import model.items.aspects.Craftable;

public class HeavyGunpowder extends Item implements Craftable {

    public HeavyGunpowder(int index) {
        super("HG", "Heavy Gunpowder", Types.GUNPOWDER, index, 10);
    }
}
