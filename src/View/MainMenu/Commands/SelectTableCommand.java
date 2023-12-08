package View.MainMenu.Commands;

import java.util.Scanner;

import Controllers.HandheldController;
import View.HandheldDevice;
import View.MainMenu.Command;
import View.MainMenu.DeviceAction;

public class SelectTableCommand implements Command {
    Scanner scn = new Scanner(System.in);
    HandheldDevice handheld;
    HandheldDevice tableMenu;
    boolean startup;

    public SelectTableCommand(HandheldDevice handheld) {
        this.handheld = handheld;
        this.tableMenu = new HandheldDevice("Table Menu: ", "<-- return", "Returning to Main menu...", 2, 0);
        this.startup = true;
    }

    public void selectTable() {
        System.out.print("Choose Table: ");
        String text = scn.next();
        System.out.println("");

        handheld.handheldController.currTable = handheld.handheldController.floorMap.getTable(Integer.parseInt(text));

        if (startup) {
            /* View Menu Command */
            ViewMenuCommand viewMenuCommand = new ViewMenuCommand(handheld.handheldController);
            DeviceAction viewMenu = new DeviceAction('m', "View Menu", viewMenuCommand);
            tableMenu.addAction(viewMenu);
    
            /* Select Category Command */
            SelectCategoryCommand selectCategoryCommand = new SelectCategoryCommand(handheld.handheldController);
            DeviceAction selectCategory = new DeviceAction('c', "Select a Category", selectCategoryCommand);
            tableMenu.addAction(selectCategory);
    
            /* Add Item Command */
            AddItemCommand addItemCommand = new AddItemCommand(handheld.handheldController);
            DeviceAction addItem = new DeviceAction('i', "Add an Item", addItemCommand);
            tableMenu.addAction(addItem);
    
            /* Place Order Command */
            PlaceOrderCommand placeOrderCommand = new PlaceOrderCommand(handheld.handheldController);
            DeviceAction placeOrder = new DeviceAction('o', "Place an Order", placeOrderCommand);
            tableMenu.addAction(placeOrder);

            /* Select Checkout Command */
            SelectCheckoutCommand selectCheckoutCommand = new SelectCheckoutCommand(handheld.handheldController);
            DeviceAction selectCheckout = new DeviceAction('s', "Select Checkout", selectCheckoutCommand);
            tableMenu.addAction(selectCheckout);

            /* Make Payment Command */
            MakePaymentCommand makePaymentCommand = new MakePaymentCommand(handheld.handheldController);
            DeviceAction makePayment = new DeviceAction('p', "Make Payment", makePaymentCommand);
            tableMenu.addAction(makePayment);

            /* Confirm Checkout Command */
            ConfirmCheckoutCommand confirmCheckoutCommand = new ConfirmCheckoutCommand(handheld.handheldController);
            DeviceAction confirmCheckout = new DeviceAction('u', "Confirm Checkout", confirmCheckoutCommand);
            tableMenu.addAction(confirmCheckout);

            startup = false;
        }

        tableMenu.start();
    };

    public void execute() {selectTable();};
}
