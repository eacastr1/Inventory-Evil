package model.inventory;

import model.items.Item;

import java.util.ArrayList;
import java.util.TreeSet;

public class Inventory {
    private final int size = 8;
    private final ArrayList<Item> inventory = new ArrayList<>(size);
    private final TreeSet<Integer> empty = new TreeSet<>();

    public Inventory() {
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
    public void remove(int idx) {
        inventory.set(idx, null);
        empty.add(idx);
    }

    // Move element
    public void move(int idx1, int idx2) {
        Item i = inventory.get(idx2);
        inventory.set(idx2, inventory.get(idx1));
        inventory.set(idx1, i);
    }

    // Get element
    public Item get(int idx) {
        return inventory.get(idx);
    }

    public int getSize() {
        return inventory.size();
    }
}
