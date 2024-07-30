package workshop1.shoppingcart;

public class ShoppingMain {
    public static void main(String[] args) {
        Clothing p1=new Clothing("Shirt");
        p1.setPrice(700);
        p1.setColor("Black");
        Cart cart=new Cart();
        cart.add(p1);
        Clothing p2=new Clothing("Jeans");
        p2.setPrice(1000);
        p2.setColor("Black");
        cart.add(p2);
        cart.checkout();
        cart.cartDetails();
        cart.displayOrders();
    }
}
