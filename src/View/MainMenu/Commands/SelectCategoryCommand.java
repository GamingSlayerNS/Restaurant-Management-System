package View.MainMenu.Commands;

import java.util.Scanner;

import Controllers.HandheldController;
import View.MainMenu.Command;

public class SelectCategoryCommand implements Command {
    Scanner scn = new Scanner(System.in);
    HandheldController handheldController;

    public SelectCategoryCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void selectCategory() {
        System.out.print("Choose Menu Category: ");
        String text = scn.next();
        System.out.println("");
        handheldController.selectCategory(text);
    };

    public void execute() {selectCategory();};
}
