package TicTacToe.src.com.ashmit.tictactoe;

public class Player {

    private String name;
    private char symbol;  // 'X' or 'O'

    public Player(String name, char symbol) {
       this.name = (name == null || name.isEmpty()) ? "Player" : name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
