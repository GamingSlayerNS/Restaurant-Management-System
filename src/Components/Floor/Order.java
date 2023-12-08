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
        System.out.println("OrderID:\t" + orderID);
        System.out.println("Name:\t\t" + customerName);
        if (cardNum != 0) {
            System.out.println("Card number:\t" + cardNum);
        } else {
            System.out.println("Card number:\tN/A");
        } 
        if (items.size() > 0) {
            System.out.println("\nItems:");
            int longest = 0;
            for (MenuItem item: items) {
                if (item.name.length() > longest)
                    longest = item.name.length();
            }
            for (MenuItem item : items) {
                System.out.print(String.format("\t%-" + longest + "s\t%.2f\t%s%n", item.name, item.price, item.category));
            }
        }
        System.out.printf("\nTotal:\t\t%.2f%n", total);
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
