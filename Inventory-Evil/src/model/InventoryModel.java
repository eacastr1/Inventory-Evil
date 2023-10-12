package model;

import model.inventory.Inventory;
import model.inventory.Storage;
import model.items.Item;

public class InventoryModel {
    private final Inventory inventory = new Inventory();
    private final Storage storage = new Storage();

    // ADD TO INVENTORY (BUY)
    public void addToInventory(Item i) {
        if(!inventory.add(i)) {
            // add to storage
        }
    }

    // MOVE
    public void moveInsideInventory(int idx1, int idx2) throws IllegalArgumentException{
        if((idx1 >= inventory.getSize() || idx1 < 0) || (idx2 >= inventory.getSize() || idx2 < 0)) {
            throw new IllegalArgumentException("Invalid index!");
        }
        inventory.move(idx1, idx2);
    }
    // REMOVE FROM INVENTORY
    public void removeFromInventory(int idx) throws IllegalArgumentException {
        if((idx >= inventory.getSize() || idx < 0)) {
            throw new IllegalArgumentException("Invalid index!");
        }
        inventory.remove(idx);
    }
    // INVENTORY TO STORAGE

    // STORAGE TO INVENTORY
    public void addToStorage(Item i) {
        storage.add(i);
    }

    // REMOVE FROM STORAGE
}
