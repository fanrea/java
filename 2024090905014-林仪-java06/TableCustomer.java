public class TableCustomer extends Customer{
    public int tableId;//餐桌编号

    public TableCustomer(int tableId) {
        this.tableId = tableId;
    }
    public int getTableId() {
        return tableId;
    }
    public void setTableId(int tableId) {
        this.tableId = tableId;
    }
}

