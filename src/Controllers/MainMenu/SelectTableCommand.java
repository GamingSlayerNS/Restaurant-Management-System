package Controllers.MainMenu;

public class SelectTableCommand implements Command {
    public void selectTable() {
        System.out.println("Table 1 Selected");
    };

    public void execute() {selectTable();};
}
