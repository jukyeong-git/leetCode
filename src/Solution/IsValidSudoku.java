package Solution;

import java.util.HashSet;

public class IsValidSudoku {
    //36. Valid Sudoku - https://leetcode.com/problems/valid-sudoku/description/
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char c = board[i][j];
                if(c != '.') {
                    if (!seen.add(c + "found in row: " + i) ||
                            !seen.add(c + "found in colum: " + j) ||
                            !seen.add(c + "found in subBox: " + i/3 + ", " + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
