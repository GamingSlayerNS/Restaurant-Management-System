package Components.Floor;

import java.util.Random;

import Components.Kitchen.MenuItem;

public class Table {
    public int id;
    public String status;
    private String waitress;
    public Tab tab;

    public Table(int id) {
        String[] status = {"Empty", "Full", "Dirty"};
        Random random = new Random();
        this.id = id;
        this.status = status[random.nextInt(status.length)];
        this.tab = new Tab();
        this.waitress = "Kaguya";
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
