import View.HandheldDevice;
import View.MainMenu.DeviceAction;
import View.MainMenu.Commands.*;

public class RMS {
    public static void main(String[] args) {
        System.out.println("Starting: Restaurant Management System... \n");
        HandheldDevice handheld = new HandheldDevice(1, 25);

        /* View Floor Command */
        ViewFloorCommand viewFloorCommand = new ViewFloorCommand(handheld.handheldController);
        DeviceAction viewFloor = new DeviceAction('v', "View Tempest FloorMap", viewFloorCommand);
        handheld.addAction(viewFloor);

        /* Select Table Command */
        SelectTableCommand selectTableCommand = new SelectTableCommand(handheld);
        DeviceAction selectTable = new DeviceAction('t', "Select a Table", selectTableCommand);
        handheld.addAction(selectTable);

        handheld.start();
    }
}

















// /* View Floor Command */
// ViewFloorCommand viewFloorCommand = new ViewFloorCommand(handheld.handheldController);
// DeviceAction viewFloor = new DeviceAction('v', "View Tempest FloorMap", viewFloorCommand);
// handheld.addAction(viewFloor);

// /* Select Table Command */
// SelectTableCommand selectTableCommand = new SelectTableCommand(handheld);
// DeviceAction selectTable = new DeviceAction('t', "Select a Table", selectTableCommand);
// handheld.addAction(selectTable);

// /* View Menu Command */
// ViewMenuCommand viewMenuCommand = new ViewMenuCommand(handheld.handheldController);
// DeviceAction viewMenu = new DeviceAction('m', "View Menu", viewMenuCommand);
// handheld.addAction(viewMenu);

// /* Select Category Command */
// SelectCategoryCommand selectCategoryCommand = new SelectCategoryCommand(handheld.handheldController);
// DeviceAction selectCategory = new DeviceAction('c', "Select a Category", selectCategoryCommand);
// handheld.addAction(selectCategory);

// /* Add Item Command */
// AddItemCommand addItemCommand = new AddItemCommand(handheld.handheldController);
// DeviceAction addItem = new DeviceAction('i', "Add an Item", addItemCommand);
// handheld.addAction(addItem);

// /* Place Order Command */
// PlaceOrderCommand placeOrderCommand = new PlaceOrderCommand(handheld.handheldController);
// DeviceAction placeOrder = new DeviceAction('o', "Place an Order", placeOrderCommand);
// handheld.addAction(placeOrder);

// /* Select Checkout Command */
// SelectCheckoutCommand selectCheckoutCommand = new SelectCheckoutCommand(handheld.handheldController);
// DeviceAction selectCheckout = new DeviceAction('s', "Select Checkout", selectCheckoutCommand);
// handheld.addAction(selectCheckout);

// /* Make Payment Command */
// MakePaymentCommand makePaymentCommand = new MakePaymentCommand(handheld.handheldController);
// DeviceAction makePayment = new DeviceAction('p', "Make Payment", makePaymentCommand);
// handheld.addAction(makePayment);

// /* Confirm Checkout Command */
// ConfirmCheckoutCommand confirmCheckoutCommand = new ConfirmCheckoutCommand(handheld.handheldController);
// DeviceAction confirmCheckout = new DeviceAction('u', "Confirm Checkout", confirmCheckoutCommand);
// handheld.addAction(confirmCheckout);