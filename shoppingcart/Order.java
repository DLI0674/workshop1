package workshop1.shoppingcart;

import java.util.HashMap;

public class Order {
    int orderId;
    int orderCost;
    String paymentMode;
    String status;
    Order(int oId,int oCost,String pMode,String statos){
        this.orderId=oId;
        this.orderCost=oCost;
        this.paymentMode=pMode;
        this.status=statos;
    }
}
