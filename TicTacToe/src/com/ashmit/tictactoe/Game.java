package TicTacToe.src.com.ashmit.tictactoe;

import java.util.Scanner;

public class Game {

    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner scanner;

    public Game(Player player1 , Player player2) {
        // constructor: initialize board and players here
        this.board=new Board();
        this.player1=player1;
        this.player2=player2;
        this.currentPlayer=player1;
        this.scanner = new Scanner(System.in);

    }

    public void start() {
        // main game loop
       
        
        board.printBoard();

        while (true) {
            
        
        System.out.println("Current player " + currentPlayer.getName() + " symbol "  + currentPlayer.getSymbol());
         int row = -1, col = -1;
         while(true){
            try{
                System.out.println("enter row");
                row = Integer.parseInt(scanner.nextLine().trim());
                System.out.println("enter cols"); 
                col= Integer.parseInt(scanner.nextLine().trim());
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                        System.out.println("Row and column must be between 0 and 2. Try again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numbers 0, 1, or 2.");
                }

            }
            boolean ok= takeTurn(row, col);
            if(ok==false){
            System.out.println("That cell is already occupied. Try a different cell.");
            continue; //same player tries again
            }
            if(board.checkWin(currentPlayer.getSymbol())){
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins the game");
                break;
            }
            if(board.isDraw()){
                board.printBoard();
                System.out.println("game drawn");
                break;
            }
            switchPlayer();
         }
        }      
    
    
    private void switchPlayer() {
        // toggle between player1 and player2
        if(currentPlayer==player1){
            currentPlayer=player2;
        }else{
            currentPlayer=player1;
        }
        
    }

    public boolean takeTurn(int row, int col) {
        // ask current player for move and update board
        return board.makeMove(row, col, currentPlayer.getSymbol());
    }

    private boolean isGameOver() {
        // check win or draw
        return false;
    }
}