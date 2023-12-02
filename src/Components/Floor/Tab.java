package Components.Floor;

import java.util.ArrayList;

import Components.Kitchen.MenuItem;

public class Tab {
    private ArrayList<MenuItem> items = new ArrayList<MenuItem>();

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem item) {
        // inventory.getStock();
        items.add(item);
    }
}
