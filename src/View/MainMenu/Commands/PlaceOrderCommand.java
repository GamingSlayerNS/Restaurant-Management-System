package View.MainMenu.Commands;

import Controllers.HandheldController;
import View.MainMenu.Command;

public class PlaceOrderCommand implements Command {
    HandheldController handheldController;

    public PlaceOrderCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void placeOrder() {
        handheldController.placeOrder();
    };

    public void execute() {placeOrder();};
}
