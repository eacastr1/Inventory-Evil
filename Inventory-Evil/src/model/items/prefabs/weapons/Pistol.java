package model.items.prefabs.weapons;

import model.items.Types;
import model.items.ShootableWeapon;

public class Pistol extends ShootableWeapon {

    public Pistol(int index) {
        super("PG", "Pistol", Types.WEAPON, index, 100, 5, 15);
    }
}
