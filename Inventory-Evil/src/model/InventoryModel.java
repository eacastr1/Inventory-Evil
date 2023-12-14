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
        if(!inventory.add(i)) {
            // add to storage
            addToStorage(i);
        }
    }
    // GET FROM INVENTORY
    public Item getFromInventory(int idx) throws IllegalArgumentException {
        if(idx >= inventory.getSize() || idx < 0) {
            throw new IllegalArgumentException("Invalid index!");
        }
        return inventory.get(idx);
    }
    // MOVE IN INVENTORY
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
    // ADD TO STORAGE
    public void addToStorage(Item i) {
        storage.add(i);
    }
    // GET FROM STORAGE
    public Item getFromStorage(int idx) {
        return storage.get(idx);
    }
    // INVENTORY TO STORAGE
    public void inventoryToStorage(int idx) throws IllegalArgumentException{
        if(idx >= inventory.getSize() || idx < 0) {
            throw new IllegalArgumentException("Invalid index!");
        }
        Item item = getFromInventory(idx);
        removeFromInventory(idx);
        addToStorage(item);
    }
    // REMOVE FROM STORAGE
    public void removeFromStorage(int idx) throws IllegalArgumentException {
        if(idx >= inventory.getSize() || idx < 0) {
            throw new IllegalArgumentException("Invalid index!");
        }
        storage.remove(idx);
    }
    // STORAGE TO INVENTORY
    public void storageToInventory(int idx) throws IllegalArgumentException{
        if(idx >= storage.getSize() || idx < 0) {
            throw new IllegalArgumentException("Invalid index!");
        }
        Item item = getFromStorage(idx);
        removeFromStorage(idx);
        addToInventory(item);
    }
}
