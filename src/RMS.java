import View.HandheldDevice;
import View.MainMenu.DeviceAction;
import View.MainMenu.SelectTableCommand;

public class RMS {
    public static void main(String[] args) {
        System.out.println("Starting: Restaurant Management System... \n");
        HandheldDevice handheld = new HandheldDevice(1, 25);

        SelectTableCommand selectTableCommand = new SelectTableCommand(handheld.handheldController);

        DeviceAction selectTable = new DeviceAction('s', "Select a Table", selectTableCommand);

        handheld.addAction(selectTable);

        handheld.start();
    }
}