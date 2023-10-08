package model;

import model.items.ShootableWeapon;
import model.items.StackableItem;
import model.items.aspects.Craftable;
import model.items.aspects.Usable;

public class ItemModel {

    private final Player player = Player.getInstance();
    private final CraftingModel craftModel;

    public ItemModel(InventoryModel model) {
        craftModel = new CraftingModel();
    }

    // use item lol
    public <T extends Usable> void use(T item1) {
        item1.use();
    }

    public <T extends ShootableWeapon> void reload(T weapon) {

    }

    public <T extends StackableItem> void stack(T item1, T item2){
        item1.stack(item2);
        // do inventorymodel manipulations
    }

    public <T extends Craftable> void craft(T item1, T item2) {
        // do craft stuff
        // get index of item2
        // craft
        //do inventorymodel manipulations
    }
}
