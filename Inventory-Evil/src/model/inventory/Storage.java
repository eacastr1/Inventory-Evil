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
    public void remove(int idx) {
        ListIterator<Item> itr = storage.listIterator();
        while(itr.hasNext()) {
            if(itr.next().getIndex() == idx) {
                itr.remove();
            }
        }
    }

    // get from storage
    public Item get(int idx) {
        return storage.get(idx);
    }

    public int getSize() {
        return storage.size();
    }
}
