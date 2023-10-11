package model.items.prefabs.weapons;

import model.items.Types;
import model.items.ShootableWeapon;

public class Magnum extends ShootableWeapon {

    public Magnum(int index) {
        super("MG", "Magnum", Types.WEAPON, index, 300, 2, 8);
    }
}
