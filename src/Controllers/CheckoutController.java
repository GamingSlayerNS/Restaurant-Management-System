package Controllers;

import Components.Floor.Order;
import Components.Kitchen.Inventory;

public class CheckoutController {
    Order currOrder = null;
    Inventory inventory;

    public void setOrder(Order order, Inventory inventory) {
        this.currOrder = order;
        this.inventory = inventory;
    }

    public void selectCheckout() {
        if (currOrder != null) {
            System.out.println("Order Summary: \n");
            currOrder.calculateTotal();
            currOrder.getOrderDetails();
        } else {
            System.out.println("No order has been placed for this table.");
        }
    }

    public void verifyPayment(int cardNum) {
        if (currOrder != null) {
            if (currOrder.total != 0) {
                currOrder.addPaymentInfo(cardNum);
                System.out.println("Payment information added!");
            } else {
                System.out.println("Please select a checkout method first");
            }
        } else {
            System.out.println("No order has been placed for this table. Transaction terminated.");
        }
    }

    public boolean confirmCheckout() {
        boolean success = false;
        if (currOrder != null) {
            if (currOrder.total != 0) {
                if (currOrder.cardNum != 0) {
                    System.out.println("Order Receipt: \n");
                    success = true;
                    currOrder.getOrderDetails();
                    inventory.updateInventory();
                    System.out.println(inventory.stock);
                    return success;
                } else {
                    System.out.println("No payment has been made for this table.");
                    return success;
                } 
            } else {
                System.out.println("Please select a checkout method first.");
                return success;
            }
        } else {
            System.out.println("No order has been placed for this table. Transaction terminated.");
            return success;
        }
    }
}
