package model.items.prefabs.gunpowder;

import model.items.Item;
import model.items.Types;
import model.items.aspects.Craftable;

public class LightGunpowder extends Item implements Craftable {

    public LightGunpowder(int index) {
        super("LG", "Light Gunpowder", Types.GUNPOWDER, index, 5);
    }
}
