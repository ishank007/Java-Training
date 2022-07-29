import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int histFigCount=scan.nextInt();
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
        String[][] info=new String[histFigCount][3];
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
         
        //Watch out for the nextLine() pitfall. 
        //Task 3 
        for (int i=0;i<histFigCount;i++) {
            for(int j=0;j<3;){

            
            System.out.println("\n\tFigure " + (i+1)); 
            System.out.print("\t - Name: ");
            String name=scan.next();
            
            //pick up and store figure's name.  
            info[i][j++]=name ;
            System.out.print("\t - Date of birth: ");
            String dob=scan.next();
           // pick up and store figure's birthday.
            info[i][j++]=dob;
            System.out.print("\t - Occupation: ");
            //pick up and store figure's occupation. 
            String occ=scan.next();
            info[i][j++]=occ;
            System.out.print("\n");
            }
        }
        
        
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 
        for(int i=0;i<histFigCount;i++){
            for(int j=0;j<3;j++){
                System.out.print(info[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.print("\nWho do you want information on? ");  
        String info_user=scan.next();
        int f=0;
        for(int i=0;i<histFigCount;i++){
            if(info[i][0].equals(info_user)){
                f=1;
                System.out.println("Name "+info[i][0]);
                System.out.println("Dob "+info[i][1]);
                System.out.println("Occupation "+info[i][2]);
            }
        }
        if(f==0){
            System.out.println("No Information found!!");
        }
          

        scan.close();
    }



}