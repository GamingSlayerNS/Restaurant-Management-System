package View;
import java.util.Scanner;
import java.util.Vector;

import Controllers.HandheldController;
import View.MainMenu.DeviceAction;

public class HandheldDevice {
    char QUIT = 'q';
    String QUIT_TEXT = "Shutdown...";
    String TITLE_TEXT = "Handheld Device";
    Scanner scn = new Scanner(System.in);
    Vector<DeviceAction> actionList;
    String actionText;

    public HandheldController handheldController;

    public HandheldDevice(int id, int floorSize) {
        this.actionList = new Vector<DeviceAction>(0);
        this.actionText = TITLE_TEXT + " " + id + ": ";
        this.handheldController = new HandheldController(id, floorSize);
    }

    public HandheldDevice(String actionText, int id, int floorSize) {
        this.actionList = new Vector<DeviceAction>(0);
        this.actionText = actionText;
        this.handheldController = new HandheldController(id, floorSize);
    }

    public void addAction(DeviceAction action) {
        actionList.add(action);
    }

    public void displayMenu() {
        System.out.println(actionText);
        for (DeviceAction action : actionList) {
            System.out.print(action.getSelectChar() + ": ");
            System.out.println(action.getDescription());
        }
        System.out.println(QUIT + ": " + QUIT_TEXT);
    }

    private char getSelection() {
        char returnValue;
        System.out.print("$user> ");
        String text = scn.next();
        System.out.println("");

        if (text.length() == 0) {
            returnValue = '\0';
        } else {
            returnValue = text.charAt(0);
        }
        
        return returnValue;
    }

    public void start() {
        char selectChar;

        do {
            displayMenu();
            selectChar = getSelection();
            if (selectChar != QUIT) {
                boolean valid = false;
                for (DeviceAction action : actionList) {
                    if (selectChar == action.getSelectChar()) {
                        valid = true;
                        action.execute();
                        break;
                    }
                }

                if (valid) {
                    System.out.println("");
                } else {
                    System.out.println("The action " + selectChar + " was invalid" + "\n");
                }
            }
        } while (selectChar != QUIT);

        System.out.println("Shutting Down... Goodbye");
    }
}