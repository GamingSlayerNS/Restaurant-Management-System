package Controllers;

import Components.Floor.FloorMap;
import Components.Floor.Order;
import Components.Kitchen.MenuItem;

public class HandheldController {
    int id;
    FloorMap floorMap;

    public HandheldController(int id, int floorSize) {
        this.id = id;
        floorMap = new FloorMap(floorSize);
    }

    public void viewFloor() {}

    public void selecTable(int id) {
        System.out.println("Table: " + id);
    }

    public void viewMenu() {}

    public void selectCategory(String category) {}

    public void addItem(MenuItem item) {}

    public void placeOrder(Order order) {}

    public void selecCheckout() {}

    public void makePayment(int cardNum, double amount) {}

    public void confirmCheckout() {}
}
