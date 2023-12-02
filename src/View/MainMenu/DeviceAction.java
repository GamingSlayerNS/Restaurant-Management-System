package View.MainMenu;

/**
 * MenuItem
 */
public class DeviceAction {
    private char selectChar;
    private String description;
    static quitCommand dummyCommand;
    Command theCommand;
    
    public DeviceAction() {
        this.selectChar = 'q';
        this.description = "Quit";
        theCommand = dummyCommand;
    }

    public DeviceAction(char selectChar, String description, Command cmd) {
        this.selectChar = selectChar;
        this.description = description;
        theCommand = cmd;
    }
    
    public char getSelectChar() {
        return selectChar;
    }

    public String getDescription() {
        return description;
    }

    public void execute() {
        theCommand.execute();
    }
}

abstract class quitCommand implements Command {
    quitCommand() {}
    public abstract void execute();
}