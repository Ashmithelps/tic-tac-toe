package TicTacToe.src.com.ashmit.tictactoe;

public class Player {

    private String name;
    private char symbol;  // 'X' or 'O'
 private boolean isComputer;  // new field

    public Player(String name, char symbol, boolean isComputer) {
       this.name = (name == null || name.isEmpty()) ? "Player" : name; // if we doesnt enter the name it uses Player as a name by default else name 
        this.symbol = symbol;
         this.isComputer = isComputer;

    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
    public boolean isComputer(){
        return isComputer;
    }
}
