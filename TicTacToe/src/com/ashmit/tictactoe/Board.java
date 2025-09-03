package TicTacToe.src.com.ashmit.tictactoe;

public class Board {
//public static final String PURPLE = "\u001B[35m";
//public static final String RESET = "\u001B[0m";
    private char[][] grid;  // 3x3 board

    public Board() {
        // initialize board with empty cells
        grid=new char[3][3];
         grid[0][0] = '-';
        grid[0][1] = '-';
        grid[0][2] = '-';
        grid[1][0] = '-';
        grid[1][1] = '-';
        grid[1][2] = '-';
        grid[2][0] = '-';
        grid[2][1] = '-';
        grid[2][2] = '-';
    }

    public void printBoard() {
        // print current state of the board
        final String YELLOW = "\u001B[33m";     // for X
    final String BLUE = "\u001B[34m";    // for O
    final String PURPLE = "\u001B[35m";  // for empty cell '-'
    final String RESET = "\u001B[0m";    // reset to default

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            char cell = grid[i][j];
            if (cell == 'X') {
                System.out.print(YELLOW + cell + " " + RESET);
            } else if (cell == 'O') {
                System.out.print(BLUE + cell + " " + RESET);
            } else {
                System.out.print(PURPLE + cell + " " + RESET);
            }
        }
        System.out.println();
    }
    }

    public boolean makeMove(int row, int col, char symbol) {
        // place symbol if cell empty, return true if successful, false otherwise
        if(row>2 || col>2 || grid[row][col]!='-'){

            return false;
        }
        grid[row][col]=symbol;
        
        return true;
     

    }

    public boolean checkWin(char symbol) {
        // return true if symbol has 3 in a row
        //to check row
        for(int i=0;i<3;i++){
            if(grid[i][0]==symbol && grid[i][1]==symbol && grid[i][2]==symbol){
                return true;
            }
        }


        // to check col
        for(int i=0;i<3;i++){
            if(grid[0][i]==symbol && grid[1][i]==symbol && grid[2][i]==symbol){
                return true;
            }
        }


        // to check diagonal
        if(grid[0][0]==symbol && grid[1][1]==symbol && grid[2][2]==symbol){
            return true;
        }
        if(grid[2][0]==symbol && grid[1][1]==symbol && grid[0][2]==symbol){
            return true;
        }


        return false;
    }

    public boolean isDraw() {
        // return true if board is full and no winner
       if(checkWin('X') || checkWin('O')){
        return false;
       }
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(grid[i][j]=='-'){
                return false;
            }
        }
       }
        return true;
    }

    public boolean isCellEmpty(int row, int col) {
        // return true if cell not taken
        return false;
    }
}