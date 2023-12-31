package View.MainMenu.Commands;

import java.util.Scanner;

import Controllers.HandheldController;
import View.MainMenu.Command;

public class MakePaymentCommand implements Command {
    Scanner scn = new Scanner(System.in);
    HandheldController handheldController;

    public MakePaymentCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void makePayment() {
        System.out.print("Swipe Creditcard: ");
        String text = scn.next();
        System.out.println("");
        handheldController.makePayment(Integer.parseInt(text));
    };

    public void execute() {makePayment();};
}
