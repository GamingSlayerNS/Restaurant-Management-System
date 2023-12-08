package Controllers;

import Components.Floor.Order;

public class CheckoutController {
    Order currOrder = null;

    public void setOrder(Order order) {
        this.currOrder = order;
    }

    public void selectCheckout() {
        currOrder.calculateTotal();
        currOrder.getOrderDetails();
    }

    public void verifyPayment(int cardNum) {
        currOrder.addPaymentInfo(cardNum);
    }

    public void confirmCheckout() {
        currOrder.getOrderDetails();
    }
}
