import Components.Floor.FloorMap;
import View.HandheldDevice;
import View.MainMenu.DeviceAction;
import View.MainMenu.SelectTableCommand;

public class RMS {
    public static void main(String[] args) {
        System.out.println("Starting: Restaurant Management System... \n");
        HandheldDevice handheld = new HandheldDevice();

        SelectTableCommand selectTableCommand = new SelectTableCommand();

        DeviceAction selectTable = new DeviceAction('s', "Select a Table", selectTableCommand);

        handheld.addAction(selectTable);

        handheld.start();

        // FloorMap fm = new FloorMap(25);
        // fm.renderTables();
        // for (int i = 0; i < 25; i++) {
        //     // System.out.println(fm.getTable(i).id + fm.getTable(i).status);
        //     fm.getTable(i).renderTable();
        // }
    }
}