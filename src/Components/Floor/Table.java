package Components.Floor;

import Components.Kitchen.MenuItem;

public class Table {
    public int id;
    public String status;
    private String waitress;
    private Tab tab;

    public Table(int id) {
        this.id = id;
        this.status = "Empty";
        this.tab = new Tab();
        this.waitress = "";
    }
    
    public String getWaitress() {
        return waitress;
    }

    public Tab getTab() {
        return tab;
    }
    
    public void orderItem(MenuItem item) {
        tab.addItem(item);
    }

    public void renderTable() {
        System.out.println(id + ": " + status + " | " + waitress + " | " + tab);
    }
}
