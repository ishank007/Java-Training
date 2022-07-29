import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
         Item[][] items = new Item[][] {
         { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
         { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
         { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
     };
        // Item item=new Item("pepsi",1.99,3);
        // System.out.println(item);
        
        Machine machine=new Machine(items);
        
        // getters setters testing worked!
        //getting item from 2,1 
        // Item i=new Item(machine.getItem(2, 1));
        // i.setprice(2.99);
        // machine.setItem(2, 1, i);
        // System.out.println(machine.getItem(2, 1));

        //dispense testing worked!
        // machine.dispense(0, 0);
        // machine.dispense(0, 0);
        // System.out.println(machine.getItem(0, 0));
        
        // System.out.println(machine);
        
        Scanner scan=new Scanner(System.in);
        String one="1";
        while(one.equals("1")){
        System.out.println(machine);
            System.out.print("Pick a row: "); 
        int row=scan.nextInt();
        System.out.print("Pick a spot in the row: "); 
        int spot=scan.nextInt();
        boolean b=machine.dispense(row, spot);
        
        if(b==true){
            System.out.println("\nEnjoy your drink! Press 1 to purchase another: ");
            one=scan.nextLine();
        }
        else{
            System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: ");
            one=scan.nextLine();
        }
        }
        scan.close();
        
    }
}