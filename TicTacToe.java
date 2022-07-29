import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");
            char[][] array={{'_','_','_'},
                            {'_','_','_'},
                            {'_','_','_'},
                        };
            
            printBoard(array);
            //Task 2: Call the function printBoard();
            int flag=0;
            for(int i=0;i<9;i++){
                if(i%2!=0){
                    System.out.println("X Turn");
                    int[] p1=askUser(array);
                    array[p1[0]][p1[1]]='X';
                    printBoard(array);
                    if(detectWinner(array)==1){
                        flag=1;
                        System.out.println("X is the winner");
                        break;
                    };
                }
                else{
                    System.out.println("O Turn");
                    int[] p2=askUser(array);
                    array[p2[0]][p2[1]]='O';
                    printBoard(array);
                    if(detectWinner(array)==0){
                        flag=1;
                        System.out.println("O is the winner");
                        break;
                    };
                }   
            }
            if(flag==0){System.out.println("Its a Draw");}
            scan.close();
        }


    public static void printBoard(char ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                System.out.print("\t"+ar[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    public static int[] askUser(char ars[][]) {
        System.out.println("Pick a row and Column");
        int spot1=scan.nextInt();
        int spot2=scan.nextInt();
        if(ars[spot1][spot2]!='_'){
            while(true){
                System.out.println("Choose empty row and Column");
                spot1=scan.nextInt();
                spot2=scan.nextInt();
                if(ars[spot1][spot2]=='_'){
                    break;
                }
            }
        }
        int[] arr=new int[2];
        arr[0]=spot1;
        arr[1]=spot2;
        return arr;
    }
    
    public static int detectWinner (char ars[][]) {
        int count_0=0;
        int count_X=0;
            if(ars[0][0]=='O' && ars[0][1]=='O' && ars[0][2]=='O'){count_0++;

            }
            else if(ars[1][0]=='O' && ars[1][1]=='O' && ars[1][2]=='O'){count_0++;
        
            }
            else if(ars[2][0]=='O' && ars[2][1]=='O' && ars[2][2]=='O'){count_0++;

            }
            else if(ars[0][0]=='X' && ars[0][1]=='X' && ars[0][2]=='X'){count_X++;

            }
            else if(ars[1][0]=='X' && ars[1][1]=='X' && ars[1][2]=='X'){count_X++;
    
            }
            else if(ars[2][0]=='X' && ars[2][1]=='X' && ars[2][2]=='X'){count_X++;
                
            }
            else if(ars[0][0]=='O' && ars[1][0]=='O' && ars[2][0]=='O'){count_0++;

            }
            else if(ars[0][1]=='O' && ars[1][1]=='O' && ars[2][1]=='O'){count_0++;
    
            }
            else if(ars[0][2]=='O' && ars[1][2]=='O' && ars[2][2]=='O'){count_0++;
                
            }
            else if(ars[0][0]=='X' && ars[1][0]=='X' && ars[2][0]=='X'){count_X++;

            }
            else if(ars[0][1]=='X' && ars[1][1]=='X' && ars[2][1]=='X'){count_X++;
    
            }
            else if(ars[0][2]=='X' && ars[1][2]=='X' && ars[2][2]=='X'){count_X++;
                
            }
            //Diagnoal cases
            else if(ars[0][0]=='O' && ars[1][1]=='O' && ars[2][2]=='O'){count_0++;

            }
            else if(ars[0][2]=='O' && ars[1][1]=='O' && ars[2][0]=='O'){count_0++;
    
            }
            else if(ars[0][0]=='X' && ars[1][1]=='X' && ars[2][2]=='X'){count_X++;

            }
            else if(ars[0][2]=='X' && ars[1][1]=='X' && ars[2][0]=='X'){count_X++;
    
            }
        
        if(count_0>count_X){
            return 0;
        }
        else if(count_0<count_X){
            return 1;
        }
        return 3;
    }
}