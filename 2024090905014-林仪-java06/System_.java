import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

class System_ {
    //请补全处理订单的函数
    public void manageOrder(LinkedHashMap<Customer,Dish> dishes) {
        //要求1：一旦订单里有一个菜品的原料不足以烹饪，就输出c，否则输出所有菜品的烹饪方法，最后再输出该订单的编号，编号从1开始递增。
        int i = 0;
        Set<Customer> keys=dishes.keySet();
        for (Customer cus : keys) {
                      if (dishes.get(cus).check()) {
                System.out.println("取消订单\t" + (++i));}
                      else {//材料充足
                         if (cus instanceof TableCustomer) {
                             dishes.get(cus).cook();
                             TableCustomer tc = (TableCustomer) cus;
                             System.out.println(++i + "\t桌号是" + tc.getTableId());
                         }
                         else if(cus instanceof WechatCustomer){
                             dishes.get(cus).cook();
                             WechatCustomer wc = (WechatCustomer) cus;
                             if(wc.isTakeout())
                                 System.out.println(++i + "\t送餐地址是" + wc.getAddress());
                             else
                                 System.out.println(++i + "\t桌号是" + wc.getTableId());

                         }
                         else {
                             System.out.println("客户类型无效");
                         }
            }


        }


    }
}
