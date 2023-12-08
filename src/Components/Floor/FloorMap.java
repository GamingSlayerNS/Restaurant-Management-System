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
        return tables[id - 1];
    }

    public void renderFloor() {
        for (Table table : tables) {
            System.out.println(
                table.id + ":\t" + table.status + "\t|   " + table.getWaitress()
            );
        }
    }

    // public int getFloorSize() {
    //     return floorSize;
    // }
}
