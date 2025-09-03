package TicTacToe.src.com.ashmit.tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter your choice");
System.out.println("1 For Local play");
System.out.println("2 For computer based");
int choice=sc.nextInt();
sc.nextLine(); 

System.out.println("enter your name");
String PlayerOneName=sc.nextLine();
   Player p1 = new Player(PlayerOneName, 'X', false);
   Player p2 = null;
   if(choice==1){

        p2 = new Player("Bob", 'O',false);
   }else if(choice==2){
     p2 = new Player("Computer", 'O', true);
   }
        
        Game game = new Game(p1, p2);
        
        game.start();
     sc.close();
    }
}
