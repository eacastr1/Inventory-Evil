package model.inventory;

import model.items.Item;

import java.util.ArrayList;
import java.util.TreeSet;

public class Inventory {
    private final ArrayList<Item> inventory;
    private final TreeSet<Integer> empty;
    private final int size = 8;

    public Inventory() {
        inventory = new ArrayList<>(size);
        empty = new TreeSet<>();
        setup();
    }
    private void setup() {
        for(int i = 0; i < 8; i++) {
            empty.add(i);
        }
    }
    // Add in element
    public boolean add(Item i) {
        // check edge case, if inventory is not completely full...
        if(inventory.size() != size) {
            inventory.add(empty.first(), i);
            empty.remove(empty.first());
            return true;
        }
        return false;
    }
    // Remove element
    public void remove(int idx) throws IllegalArgumentException {
        if((idx >= size || idx < 0)) {
            throw new IllegalArgumentException("Invalid index!");
        }
        inventory.set(idx, null);
        empty.add(idx);
    }

    // Move element
    public void move(int idx1, int idx2) throws IllegalArgumentException{
        if((idx1 >= size || idx1 < 0) || (idx2 >= size || idx2 < 0)) {
            throw new IllegalArgumentException("Invalid index!");
        }
        Item i = inventory.get(idx2);
        inventory.set(idx2, inventory.get(idx1));
        inventory.set(idx1, i);
    }
}
