package workshop1.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
    private ArrayList<Clothing>arr=new ArrayList<Clothing>();
    private int ct=0;
    Orders orders=new Orders();
    int total;
    void add(Clothing id){
        arr.add(id);
    }
    void remove(Clothing id){
        arr.remove(id);
    }
    void checkout(){
        total=0;
        for(int i=0;i<arr.size();i++){
            total+=arr.get(i).getPrice();
        }
        Order order=new Order(ct++,total,"COD","Delivered");
        orders.addOrder(order);
    }
    void cartDetails(){
        System.out.println("Number of items: "+arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.println("Item name: "+arr.get(i).getName());
            System.out.println("Item price: "+arr.get(i).getPrice());
            System.out.println("Item color: "+arr.get(i).getColor());
        }
        System.out.println("Total cart cost: "+total);
    }
    void displayOrders(){
        orders.getOrder();
    }
}
