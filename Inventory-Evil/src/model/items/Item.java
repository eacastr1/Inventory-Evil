package model.items;

import java.io.Serializable;

public abstract class Item implements Comparable<Item>, Serializable {
    private final String id, name;
    private final int index, value;

    public Item(String id, String name, int index, int value) {
        this.id = id;
        this.name = name;
        this.index = index;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }

    public String getID() {
        return id;
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(value, o.getValue());
    }
}
