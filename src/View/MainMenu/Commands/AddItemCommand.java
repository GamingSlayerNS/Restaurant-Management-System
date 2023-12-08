package View.MainMenu.Commands;

import java.util.Scanner;

import Controllers.HandheldController;
import View.MainMenu.Command;

public class AddItemCommand implements Command {
    Scanner scn = new Scanner(System.in);
    HandheldController handheldController;

    public AddItemCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void addItem() {
        System.out.print("Choose Item: ");
        String text = scn.next();
        System.out.println("");
        handheldController.addItem(null);
    };

    public void execute() {addItem();};
}
