package workshop1.shoppingcart;

public class Clothing extends Product{
    private int price;
    private String color;

    Clothing(String name){
        super(name);
    }
    public String getName(){
        return name;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
