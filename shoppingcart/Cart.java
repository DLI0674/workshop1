package workshop1.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private HashMap<Clothing,Integer>arr=new HashMap<Clothing, Integer>();
    private int ct=0;
    Orders orders=new Orders();
    int total;
    void add(Clothing id){
        if(arr.containsKey(id)){
            arr.put(id,arr.get(id)+1);
        }
        else{
            arr.put(id,1);
        }
    }
    void remove(Clothing id){
        if(arr.containsKey(id)){
            if(arr.get(id)>1){
                arr.put(id,arr.get(id)-1);
            }
            else{
                arr.remove(id);
            }
        }
        else{
            System.out.println("Product not included in cart.");
        }
    }
    void checkout(){
        total=0;
        for(Map.Entry<Clothing,Integer>x:arr.entrySet()){
            total+=(x.getKey().getPrice())*x.getValue();
        }
        Order order=new Order(ct++,total,"COD","Delivered");
        orders.addOrder(order);
    }
    void cartDetails(){
        for(Map.Entry<Clothing,Integer>x:arr.entrySet()){
            System.out.println("Item count: "+x.getValue());
            System.out.println("Item name: "+x.getKey().getName());
            System.out.println("Item price: "+x.getKey().getPrice());
            System.out.println("Item color: "+x.getKey().getColor());
        }
        System.out.println("Total cart cost: "+total);
    }
    void displayOrders(){
        orders.getOrder();
    }
}
