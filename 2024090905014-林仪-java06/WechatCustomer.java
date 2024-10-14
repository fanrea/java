public class WechatCustomer extends Customer{
    public String address;//顾客地址
    public boolean takeout;//true代表该顾客是外卖，false代表该顾客是堂食
    public int tableId;//餐桌编号

    public WechatCustomer( boolean takeout,String address) {
        this.address = address;
        this.takeout = takeout;
    }

    public WechatCustomer( boolean takeout, int tableId) {
        this.takeout = takeout;
        this.tableId = tableId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isTakeout() {
        return takeout;
    }

    public void setTakeout(boolean takeout) {
        this.takeout = takeout;
    }


    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }
}