package model.items.prefabs.weapons;

import model.items.Items;
import model.items.ShootableWeapon;

public class Magnum extends ShootableWeapon {

    public Magnum(int index) {
        super("MG", Items.MAGNUM, index, 300, 2, 8);
    }
}
