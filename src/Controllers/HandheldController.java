package Controllers;

import Components.Floor.FloorMap;
import Components.Floor.Order;
import Components.Floor.Table;
import Components.Kitchen.Menu;
import Components.Kitchen.MenuItem;

public class HandheldController {
    int id;
    public FloorMap floorMap;
    public Menu menu;
    public Table currTable;
    CheckoutController checkoutController;

    public HandheldController(int id, int floorSize) {
        this.id = id;
        floorMap = new FloorMap(floorSize);
        this.menu = new Menu();
        this.currTable = null;
        this.checkoutController = new CheckoutController();
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
        currTable.orderItem(item);
        System.out.println("Table " + currTable.id + " Tab: ");
        for (MenuItem item2 : currTable.getTab().getItems()) {
            System.out.println(item2.name);
        }
    }

    public void placeOrder() {
        Order currOrder = new Order(currTable.getTab().getItems());
        // Send to kitchen
        checkoutController.setOrder(currOrder);
    }

    public void selectCheckout() {
        checkoutController.selectCheckout();
    }

    public void makePayment(int cardNum) {
        checkoutController.verifyPayment(cardNum);
    }

    public void confirmCheckout() {
        checkoutController.confirmCheckout();
    }
}
