package Solution;

import java.util.HashSet;
import java.util.Set;

public class Valid_Sudoku {
    //36. Valid Sudoku - https://leetcode.com/problems/valid-sudoku/description/
    public static boolean isValidSudoku(char[][] board) {

        int rows = board[0].length;
        int cols = board.length;
        Set<String> set = new HashSet<>();

        for(int i = 0; i < rows; i ++) {
            for(int j = 0; j < cols; j ++) {
                char c = board[i][j];
                if(c != '.') {
                    if(!set.add("board : "+ c +", row: "+ i)
                            || !set.add("board : "+ c +", col: "+ j)
                            || !set.add("board : "+ c +", row, col: "+ i/3 +", "+ j/3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
