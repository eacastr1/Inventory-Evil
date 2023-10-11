/**
 *<h1>Item.java</h1>
 * <p>An abstract class for items in Inventory Evil.</p>
 *
 * @author Eddie Andres Castro
 * @version 0.1
 */
package model.items;

import java.io.Serializable;

public abstract class Item implements Comparable<Item>, Serializable {
    private final String id;
    private final Items name;
    private final int value;
    private int index;

    /**
     * Instantiates an Item object.
     * @param id The ID of the item.
     * @param name The name of the item.
     * @param index The index of the item, in the context of a List.
     * @param value The value of the item for which to be sold.
     */
    public Item(String id, Items name, int index, int value) {
        this.id = id;
        this.name = name;
        this.index = index;
        this.value = value;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
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

    /**
     * Compares concrete Item objects based on their value.
     * @param o the object to be compared.
     * @return a result value of the comparison between this object and the object to be compared.
     */
    @Override
    public int compareTo(Item o) {
        return Integer.compare(value, o.getValue());
    }
}
