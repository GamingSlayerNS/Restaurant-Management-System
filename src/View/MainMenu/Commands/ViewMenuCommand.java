package View.MainMenu.Commands;

import java.util.Scanner;

import Controllers.HandheldController;
import View.MainMenu.Command;

public class ViewMenuCommand implements Command {
    HandheldController handheldController;

    public ViewMenuCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void viewMenu() {
        System.out.println("Menu: ");
        handheldController.viewMenu();
    };

    public void execute() {viewMenu();};
}
