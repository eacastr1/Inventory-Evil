package model.items;

public abstract class StackableItem extends Item {
    private final int maxCapacity, defaultCapacity;
    private int currentCapacity;

    public StackableItem(String id, Items name, int index, int value,
                         int maxCapacity, int defaultCapacity) {
        super(id, name, index, value);
        this.maxCapacity = maxCapacity;
        this.defaultCapacity = defaultCapacity;
        currentCapacity = defaultCapacity;
    }

    public void stack(StackableItem item) {
        if(currentCapacity + item.currentCapacity >= maxCapacity) {
            currentCapacity = maxCapacity;
        }
        else {
            currentCapacity += item.currentCapacity;
        }
    }

    public void consume() {
        if(currentCapacity > 0) {
            this.currentCapacity--;
        }
    }
}
