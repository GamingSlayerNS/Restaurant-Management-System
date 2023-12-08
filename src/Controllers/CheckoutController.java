package Controllers;

import Components.Floor.Order;

public class CheckoutController {
    Order currOrder = null;

    public void setOrder(Order order) {
        this.currOrder = order;
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
            currOrder.addPaymentInfo(cardNum);
            System.out.println("Payment information added!");
        } else {
            System.out.println("No order has been placed for this table. Transaction terminated.");
        }
    }

    public void confirmCheckout() {
        if (currOrder != null) {
            System.out.println("Order Receipt: \n");
            currOrder.getOrderDetails();
        } else {
            System.out.println("No order has been placed for this table.");
        }
    }
}
