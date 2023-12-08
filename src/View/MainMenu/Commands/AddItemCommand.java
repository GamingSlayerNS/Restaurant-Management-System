package View.MainMenu.Commands;

import java.util.Scanner;

import Components.Kitchen.MenuItem;
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
        String text = scn.nextLine();
        System.out.println("");
        MenuItem temp = null;
        for (MenuItem item : handheldController.menu.menu) {
            if (item.name.equals(text)) {
                temp = item;
            }
        }
        if (temp != null) {
            handheldController.addItem(temp);
        } else {
            System.out.println("Invalid Item");
        }
    };

    public void execute() {addItem();};
}
