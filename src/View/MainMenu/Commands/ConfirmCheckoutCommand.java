package View.MainMenu.Commands;

import java.util.Scanner;

import Controllers.HandheldController;
import View.MainMenu.Command;

public class ConfirmCheckoutCommand implements Command {
    HandheldController handheldController;

    public ConfirmCheckoutCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void confirmCheckout() {
        handheldController.confirmCheckout();
    };

    public void execute() {confirmCheckout();};
}
