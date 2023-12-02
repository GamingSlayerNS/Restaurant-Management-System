package View.MainMenu;

import java.util.Scanner;

import Components.Floor.FloorMap;

public class SelectTableCommand implements Command {
    Scanner scn = new Scanner(System.in);
    FloorMap fm = new FloorMap(10);

    public void selectTable() {
        System.out.print("Choose Table: ");
        String text = scn.next();
        fm.renderTables();
    };

    public void execute() {selectTable();};
}
