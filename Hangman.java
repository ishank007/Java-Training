import java.util.*;
public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String rword=randomWord(words);
        int len=rword.length();
        char[] ch = rword.toCharArray();
        char[] missedch=new char[7];
        char[] Array=Blanks(len);
        int k=0;
        // System.out.print("This is the Word: ");
        printPlaceholders(Array, len);
        char[] newarr=Array;
        while(k<7){
            System.out.print("\nGuess: ");
            char gues=scan.next().charAt(0);
            int index=checkGuess(gues, ch);
            picCase(gallows, k);
            if(index!=-1){
                updatePlaceholders(index, ch, gues,newarr);
                printPlaceholders(newarr, len);

            }else{

                missedch[k++]=gues;
                missedGuess(missedch,gues);
                printPlaceholders(newarr, len);
            }
            if(wordcheck(newarr,ch,len)==1){
                System.out.println("\nYou have guessed right!!");
                break;
            }
            
        }
        if(wordcheck(newarr, ch, len)==-1){
            System.out.println("\nYou LOST!! RIP");
            System.out.println("The Correct word was: "+rword);

        }
        scan.close();
        
    }
    public static int wordcheck(char[]newarr,char[]ch, int len) {
        for(int i=0;i<len;i++){
            if(newarr[i]!=ch[i]){
                return -1;
            }
        }
        return 1;
    }
    public static char[] Blanks(int len){
        char[] JavaCharArray = new char[len];
        for(int i=0;i<len;i++){
            JavaCharArray[i]='_';
        }    
        return JavaCharArray;
    }
    public static String randomWord(String[] arr) {
        Random random = new Random();   
        int x = random.nextInt(arr.length); 
        System.out.println(arr[x]);
        return arr[x];
    }
    public static int checkGuess(char guess,char[] rword) {
       for(int i=0;i<rword.length;i++){
            if(rword[i]==guess){
                return i;
                // System.out.println(i);
            }
       }
       return -1; 
    }
    public static char[] updatePlaceholders(int j,char[]rword,char newchar, char[]newarr ){
        for(int i=0;i<rword.length;i++){
            if(rword[i]==newchar){
                newarr[j]=newchar;
            }
        }
        return newarr;
        
    } 
    public static void printPlaceholders(char[] newarr, int len) {
        System.out.print("Word: ");
        for(int i=0;i<len;i++){
            System.out.print(newarr[i]+" ");
        }
        // System.out.println("\n");
    }
    public static void missedGuess(char[] arr, char ch) {
        // arr[]=ch;
        System.out.print("Missed Guess: ");
        // System.out.println(k);
        for(int j=0;j<6;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println("");
        

    }
    public static void picCase(String[] array,int k) {
        switch(k){
            case 0: System.out.println(array[0]);break;
            case 1: System.out.println(array[1]);break;
            case 2: System.out.println(array[2]);break;
            case 3: System.out.println(array[3]);break;
            case 4: System.out.println(array[4]);break;
            case 5: System.out.println(array[5]);break;
            case 6: System.out.println(array[6]);break;
        }
    }

}




