package workshop1.shoppingcart;

import java.util.ArrayList;

public class Orders {
    private ArrayList<Order>arr=new ArrayList<Order>();

    public void getOrder() {
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.println("Order Id: "+arr.get(i).orderId+"\n"+"Order Cost:"+arr.get(i).orderCost+"\n"+"Order Status: "+arr.get(i).status);
        }
    }

    public void addOrder(Order x) {
        this.arr.add(x);
    }
}
