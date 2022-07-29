public class Item {
    private String name;
    private double price;
    private int quantity;

    //Constructors
    public Item(String name , double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    //Getters
    public String  getName(){
        return this.name;
    }
    public double getprice(){
        return this.price;
    }
    public int getQuanity(){
        return this.quantity;
    }
    //Setters
    public void setName(String name){
        this.name=name;
    }
    public void setprice(double price){
        this.price=price;
    }
    public void setQuanity(int quantity){
        this.quantity=quantity;
    }
    //Copy Constructer
    public Item(Item source){
        this.name=source.name;
        this.price=source.price;
        this.quantity=source.quantity;
    }
    
    //toString 
    public String toString(){
        return this.name+": "+this.price+"("+this.quantity+")";

    }
}
