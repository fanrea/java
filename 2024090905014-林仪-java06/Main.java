import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       LinkedHashMap<Customer,Dish> map = new LinkedHashMap();
        System_ sy = new System_();
        map.put(new TableCustomer(1),new Dish1());
        map.put(new TableCustomer(2),new Dish2());
        map.put(new WechatCustomer(true,"泥电"),new Dish2());
        map.put(new WechatCustomer(false,3),new Dish1());

sy.manageOrder(map);
    }
}








