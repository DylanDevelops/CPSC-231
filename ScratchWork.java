import java.util.Scanner;

public class ScratchWork {
    public static void main(String[] args) {
        boolean[][] bingoBoard = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        System.out.println("Beat bingo: " + won(bingoBoard));
    }

    private static boolean won(boolean[][] board) {
        for(int c = 0; c < board.length; c++) {
            for(int r = 0; r < board[c].length; r++) {
                if(board[c][r] == true) {
                    return false;
                } 
            }
        }
        return true;
    }
}
