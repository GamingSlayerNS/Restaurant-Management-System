package Components.Floor;

import java.util.ArrayList;

import Components.Kitchen.MenuItem;

public class Order {
    int orderID;
    ArrayList<MenuItem> items;
    String customerName;
    int cardNum;
    double total;

    public Order(ArrayList<MenuItem> items) {
        this.orderID = ((int) (Math.random() * 1000) + 10000);
        this.items = items;
        this.customerName = "Speedy";
    }

    public void getOrderDetails() {
        System.out.printf("OrderID: %15d%n", orderID);
        System.out.printf("Name: %15s%n", customerName);
        System.out.printf("Card number: %15d%n", cardNum);
        for (MenuItem item : items) {
            System.out.printf("%-25s %.2f\t%s%n", item.name, item.price, item.category);
        }
        System.out.printf("Total: %.2f%n", total);
    }

    public void calculateTotal() {
        for (MenuItem item : items) {
            total += item.price;
        }
    }

    public void addPaymentInfo(int cardNum) {
        this.cardNum = cardNum;
    }
}
