// import javax.crypto.Mac;

public class Machine {
    private Item[][] item;
    
    public  Machine(Item[][] item){
        this.item=new Item[item.length][item[0].length];
        for (int i = 0; i < item.length; i++) {
            for (int j = 0; j < item[i].length; j++) {
                this.item[i][j]=item[i][j];
            }
        }
        
    }
    public Item getItem(int row, int spot){
        return new Item(this.item[row][spot]);
    }
    public void setItem(int row, int spot, Item item){
        this.item[row][spot]=new Item(item);
    }
    public boolean dispense(int row, int spot){
        int x=this.item[row][spot].getQuanity();
        if(x>0){
            this.item[row][spot].setQuanity(x-1);
            return true;
        }
        return false;
    }    
    public String toString(){
        String temp="";
        for (int i = 0; i < item.length; i++) {
            temp+="\t";
            for (int j = 0; j < item[i].length; j++) {
                temp+=this.item[i][j].toString();
            }
            temp+="\n\n";
        }
        return temp;
    }
    /**
     * 
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */
}