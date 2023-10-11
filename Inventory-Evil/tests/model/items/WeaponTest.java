package model.items;

import model.InventoryModel;
import model.ItemModel;
import model.items.prefabs.ammo.PistolAmmo;
import model.items.prefabs.weapons.Knife;
import model.items.prefabs.weapons.Pistol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeaponTest {
    InventoryModel inventoryModel;
    ItemModel itemModel;
    Knife knife;
    Pistol pistol;
    PistolAmmo pistolAmmo;

    @Before
    public void setup() {
        inventoryModel = new InventoryModel();
        itemModel = new ItemModel(inventoryModel);
        knife = new Knife(0);
        pistol = new Pistol(1);
        pistolAmmo = new PistolAmmo(2);
    }
    // use with knife.
    @Test
    public void useWithKnife() {
        itemModel.use(knife);
        assertEquals(knife.getDurability(), 10);
    }

    @Test
    // use with shootable weapon.
    public void useWithGun() {
        itemModel.use(pistol);
        assertEquals(pistol.getCurrentAmmo(), 4);
    }

    // reload shootable weapon.
    public void reloadWithGun() {

    }
}