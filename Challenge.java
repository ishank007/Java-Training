import java.util.Scanner;
import java.util.Random;
public class Challenge{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors");
        System.out.println("Are you ready, type 'yes'");
    
        String choose=scan.next();
        if(choose.equals("yes")){
            System.out.println("Great");
            System.out.println("rock -- paper -- scissors, shoot!");
            String userip=scan.next();
            System.out.println("You chose : "+userip);
            String comp=compChoice();
            System.out.println("Computer chose: "+ comp);
            // When Tie
            if(comp.equals("Rock") && userip.equals("Rock") || comp.equals("Scissors") && userip.equals("Scissors")|| comp.equals("Paper") && userip.equals("Paper")){
                System.out.println("Tie");
            }
            // When Comp wins
            else if(comp.equals("Rock") && userip.equals("Scissors")  || comp.equals("Paper") && userip.equals("Rock") || comp.equals("Scissors") && userip.equals("Paper") ){
                System.out.println("comp won");
            }
            else{
                System.out.println("You won!!. Great");
            }
            scan.close();

        }
        else{
            System.out.println("Get ready ! pls and restart");
        }
    }
    public static String  compChoice() {
        Random random=new Random();
        int num=random.nextInt(3);
        switch(num){
            case 0: return "Rock";
            case 1: return "Scissors";
            case 2: return "Paper";
        }
        return null;
        
    }
}