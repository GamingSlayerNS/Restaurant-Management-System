package Components.Kitchen;

import java.util.HashMap;

public class Inventory {
    public HashMap<String, Integer> stock = new HashMap<String, Integer>();

    public Inventory() {
        stock.put("Milk", 69);
    }

    public boolean checkStock() {
        return true;
    }

    public void updateInventory() {
        stock.put("Milk", stock.get("Milk") - 1);
    }
}
