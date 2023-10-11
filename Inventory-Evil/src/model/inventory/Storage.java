package model.inventory;

import model.items.Item;

import java.util.LinkedList;
import java.util.ListIterator;

public class Storage {

    private final LinkedList<Item> storage;

    public Storage() {
        storage = new LinkedList<>();
    }

    // add to storage
    public void add(Item i){
        storage.add(i);
    }

    // remove from storage
    public void remove(int idx) throws IllegalArgumentException {
        if(idx >= storage.size() || idx < 0) {
            throw new IllegalArgumentException("Invalid index!");
        }

        ListIterator<Item> itr = storage.listIterator();

        while(itr.hasNext()) {
            if(itr.next().getIndex() == idx) {
                itr.remove();
            }
        }
    }
}
