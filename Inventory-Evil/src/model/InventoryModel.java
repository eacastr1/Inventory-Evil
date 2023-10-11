package model;

import model.inventory.Inventory;
import model.inventory.Storage;
import model.items.Item;

public class InventoryModel {
    private final Inventory inventory;
    private final Storage storage;

    public InventoryModel() {
        inventory = new Inventory();
        storage = new Storage();
    }

    // ADD TO INVENTORY (BUY)
    public void addToInventory(Item i) {
        boolean isFull = inventory.add(i);
        if(!isFull) {
            addToStorage(i);
        }
    }
    // MOVE
    // REMOVE FROM INVENTORY
    // INVENTORY TO STORAGE
    // STORAGE TO INVENTORY
    public void addToStorage(Item i) {
        storage.add(i);
    }

    // REMOVE FROM STORAGE
}
