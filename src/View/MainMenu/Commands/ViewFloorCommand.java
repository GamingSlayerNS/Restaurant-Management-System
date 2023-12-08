package View.MainMenu.Commands;

import Controllers.HandheldController;
import View.MainMenu.Command;

public class ViewFloorCommand implements Command {
    HandheldController handheldController;

    public ViewFloorCommand(HandheldController handheldController) {
        this.handheldController = handheldController;
    }

    public void viewFloor() {
        System.out.println("Tempest FloorMap: ");
        handheldController.viewFloor();
    };

    public void execute() {viewFloor();};
}
