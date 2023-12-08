package View.MainMenu.Commands;

import java.util.Scanner;

import Controllers.HandheldController;
import View.HandheldDevice;
import View.MainMenu.Command;
import View.MainMenu.DeviceAction;

public class SelectTableCommand implements Command {
    Scanner scn = new Scanner(System.in);
    HandheldDevice handheld;
    HandheldDevice tableMenu;

    public SelectTableCommand(HandheldDevice handheld) {
        this.handheld = handheld;
        this.tableMenu = new HandheldDevice("Table Menu: ", "<-- return", "Returning to Main menu...", 2, 0);
    }

    public void selectTable() {
        System.out.print("Choose Table: ");
        String text = scn.next();
        System.out.println("");

        
        handheld.handheldController.currTable = handheld.handheldController.floorMap.getTable(Integer.parseInt(text));

        ViewMenuCommand viewMenuCommand = new ViewMenuCommand(handheld.handheldController);
        DeviceAction viewMenu = new DeviceAction('m', "View Menu", viewMenuCommand);
        tableMenu.addAction(viewMenu);

        tableMenu.start();
    };

    public void execute() {selectTable();};
}
