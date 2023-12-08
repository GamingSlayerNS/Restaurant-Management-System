package Controllers;

import Components.Floor.FloorMap;
import Components.Floor.Table;
import Components.Floor.Order;
import Components.Kitchen.Menu;
import Components.Kitchen.MenuItem;

public class HandheldController {
    int id;
    public FloorMap floorMap;
    Menu menu;
    public Table currTable;

    public HandheldController(int id, int floorSize) {
        this.id = id;
        floorMap = new FloorMap(floorSize);
        this.menu = new Menu();
        this.currTable = null;
    }

    public void viewFloor() {
        floorMap.renderFloor();
    }

    public void selectTable(int id) {
        floorMap.getTable(id).renderTable();
    }

    public void viewMenu() {
        menu.viewMenu();
    }

    public void selectCategory(String category) {
        menu.selectCategory(category);
    }

    public void addItem(MenuItem item) {

    }

    public void placeOrder(Order order) {}

    public void selectCheckout() {}

    public void makePayment(int cardNum, double amount) {}

    public void confirmCheckout() {}
}
