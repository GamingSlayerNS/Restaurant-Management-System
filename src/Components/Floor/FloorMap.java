package Components.Floor;

public class FloorMap {
    private Table[] tables;
    // private int floorSize;

    public FloorMap(int floorSize) {
        // this.floorSize = floorSize;
        this.tables = new Table[floorSize];
        for (int i = 0; i < floorSize; i++) {
            tables[i] = new Table(i + 1);
        }
    }

    public Table getTable(int id) {
        return tables[id];
    }

    public void renderTables() {
        for (Table table : tables) {
            System.out.println(
                table.id + ": " + table.status + " | " + table.getWaitress()
            );
        }
    }

    // public int getFloorSize() {
    //     return floorSize;
    // }
}
