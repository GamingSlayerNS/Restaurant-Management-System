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

    public void selectTable() {
        System.out.print("Choose Table: ");
        String text = scn.next();
        System.out.println("");
        handheldController.selecTable(Integer.parseInt(text));
    };

    public void execute() {selectTable();};
}
