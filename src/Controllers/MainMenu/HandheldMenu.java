package Controllers.MainMenu;
import java.util.Scanner;
import java.util.Vector;

public class HandheldMenu {
    char QUIT = 'q';
    String QUIT_TEXT = "Shutdown...";
    String TITLE_TEXT = "Handheld Device Menu: ";
    Scanner scn = new Scanner(System.in);
    Vector<MenuItem> itemList;
    String menuText;

    public HandheldMenu() {
        this.itemList = new Vector<MenuItem>(0);
        this.menuText = TITLE_TEXT;
    }

    public HandheldMenu(String menuText) {
        this.itemList = new Vector<MenuItem>(0);
        this.menuText = menuText;
    }

    public void add(MenuItem item) {
        itemList.add(item);
    }

    public void displayMenu() {
        System.out.println(menuText);
        for (MenuItem menuItem : itemList) {
            System.out.print(menuItem.getSelectChar() + ": ");
            System.out.println(menuItem.getDescription());
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
                for (MenuItem menuItem : itemList) {
                    if (selectChar == menuItem.getSelectChar()) {
                        valid = true;
                        menuItem.execute();
                        break;
                    }
                }

                if (valid) {
                    System.out.println("");
                } else {
                    System.out.println("The menu item " + selectChar + " was invalid" + "\n");
                }
            }
        } while (selectChar != QUIT);
    }
}