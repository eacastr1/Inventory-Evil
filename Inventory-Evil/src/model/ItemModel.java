package model;

import model.items.Item;
import model.items.ShootableWeapon;
import model.items.StackableItem;
import model.items.aspects.Craftable;
import model.items.aspects.Usable;

public class ItemModel {

    private final Player player = Player.getInstance();
    private final CraftingModel craftModel = new CraftingModel();
    private final InventoryModel invModel;

    public ItemModel(InventoryModel model) {
        invModel = model;
    }

    // use item lol
    public <T extends Usable> void use(T item1) {
        item1.use();
    }

    public <T extends ShootableWeapon> void reload(T weapon) {
        updateStockpiles(weapon);
        int difference = weapon.getMaxAmmo() - weapon.getCurrentAmmo();

        if(weapon.getAvailableAmmo() >= difference) {
            weapon.setCurrentAmmo(weapon.getMaxAmmo());
            weapon.setAvailableAmmo(weapon.getAvailableAmmo()-difference);
        } else {
            weapon.setCurrentAmmo(weapon.getCurrentAmmo() + weapon.getAvailableAmmo());
            weapon.setAvailableAmmo(0);
        }
    }

    public <T extends ShootableWeapon> void updateStockpiles(T weapon) {
        int stockpileAmmo = player.getAmmo(weapon.getName());
        // update the available ammo from player stockpile...
        if(stockpileAmmo > 0) {
            weapon.setAvailableAmmo(weapon.getAvailableAmmo() + stockpileAmmo);
        }
    }

    public <T extends StackableItem> void stack(T item1, T item2) throws IllegalArgumentException {
        if(!(item1.getName().equals(item2.getName()))) {
            throw new IllegalArgumentException("You cannot stack items of different classes.");
        }

        int result = item2.stack(item1);

        // do inventorymodel manipulations
    }

    public <T extends Craftable> void craft(T item1, T item2) {
        // do craft stuff
        String id = ((Item)item1).getID() + ((Item)item2).getID();
        // get index of item2

        // craft
        //do inventorymodel manipulations
    }
}
