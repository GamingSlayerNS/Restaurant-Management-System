package View.MainMenu.Commands;

import java.util.Scanner;

import Controllers.HandheldController;
import View.MainMenu.Command;

public class SelectCheckoutCommand implements Command {
    HandheldController handheldController;

    public SelectCheckoutCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void selectCheckout() {
        System.out.println("Order Summary: \n");
        handheldController.selectCheckout();
    };

    public void execute() {selectCheckout();};
}
