package View.MainMenu.Commands;

import java.util.Scanner;

import Controllers.HandheldController;
import View.MainMenu.Command;

public class PlaceOrderCommand implements Command {
    Scanner scn = new Scanner(System.in);
    HandheldController handheldController;

    public PlaceOrderCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void placeOrder() {
        System.out.print("Choose Table: ");
        String text = scn.next();
        System.out.println("");
        handheldController.placeOrder(null);
    };

    public void execute() {placeOrder();};
}
