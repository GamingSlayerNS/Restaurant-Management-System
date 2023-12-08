package View.MainMenu;

import java.util.Scanner;

import Controllers.HandheldController;

public class SelectTableCommand implements Command {
    Scanner scn = new Scanner(System.in);
    HandheldController handheldController;

    public SelectTableCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void selectTable() {
        System.out.print("Choose Table: ");
        String text = scn.next();
        System.out.println("");
        handheldController.selecTable(Integer.parseInt(text));
    };

    public void execute() {selectTable();};
}
