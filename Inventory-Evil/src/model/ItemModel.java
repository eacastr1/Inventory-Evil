package model;

import model.items.Item;
import model.items.ShootableWeapon;
import model.items.StackableItem;
import model.items.aspects.Craftable;
import model.items.aspects.Usable;

public class ItemModel {

    private final Player player = Player.getInstance();
    private final CraftingModel craftModel = new CraftingModel();
    private final InventoryModel inventoryModel;

    public ItemModel(InventoryModel model) {
        inventoryModel = model;
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
        if(!Item.compareTypes(item1, item2)) {
            throw new IllegalArgumentException("You cannot stack items of different types.");
        } else if(item1.getID().equals(item2.getID())) {
            throw new IllegalArgumentException("Items must be of the same class to be stacked");
        }

        int result = item2.stack(item1);

        // do inventorymodel manipulations
    }

    public void craft(Item item1, Item item2) throws IllegalArgumentException {
        if(!Item.compareTypes(item1, item2)) {
            throw new IllegalArgumentException("Different types!");
        } else if(!(item1 instanceof Craftable)) {
            throw new IllegalArgumentException("Non-craftable items!");
        }

        // do craft stuff
        String id = item1.getID() + item2.getID(); // very small # of chars, simple string concatenation is fine
        // get index of item2
        int idx = item2.getIndex();
        // remove item 1 from inventory

        // replace item 2 with newly crafted item.
        // craft
        //do inventorymodel manipulations
    }
}
