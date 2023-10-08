package model.items;

import java.io.Serializable;

public abstract class Item implements Comparable<Item>, Serializable {
    private final String id;
    private final Items name;
    private final int value;
    private int index;

    public Item(String id, Items name, int index, int value) {
        this.id = id;
        this.name = name;
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name.toString();
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
