import Controllers.MainMenu.HandheldMenu;
import Controllers.MainMenu.MenuItem;
import Controllers.MainMenu.SelectTableCommand;

public class RMS {
    public static void main(String[] args) {
        System.out.println("Starting: Restaurant Management System... \n");
        HandheldMenu handheldMenu = new HandheldMenu();

        SelectTableCommand selectTable = new SelectTableCommand();

        MenuItem selectTableMenu = new MenuItem('s', "Select a Table", selectTable);

        handheldMenu.add(selectTableMenu);

        handheldMenu.start();
    }
}