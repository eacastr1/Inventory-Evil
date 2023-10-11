package model.items.prefabs.ammo;

import model.items.Types;
import model.items.StackableItem;

public class MagnumAmmo extends StackableItem {

    public MagnumAmmo(int index) {
        super("MA", "Magnum Ammo", Types.AMMO, index, 60, 12, 3);
    }
}
