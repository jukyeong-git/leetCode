package Solution;

public class Surrounded_Regions {
    //130. Surrounded Regions - https://leetcode.com/problems/surrounded-regions/description/

    /*
     * You are given an m x n matrix board containing letters 'X' and 'O', capture regions that are surrounded:
     * - Connect: A cell is connected to adjacent cells horizontally or vertically.
     * - Region: To form a region connect every 'O' cell.
     * - Surround: The region is surrounded with 'X' cells if you can connect the region with 'X' cells and none of the region cells are on the edge of the board.
     *
     * To capture a surrounded region, replace all 'O's with 'X's in-place within the original board. You do not need to return anything.
     *
     * Example 1:
     * - Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
     * - Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
     * Explanation:
     * - In the above diagram, the bottom region is not captured because it is on the edge of the board and cannot be surrounded.
     *
     * Example 2:
     * - Input: board = [["X"]]
     * - Output: [["X"]]
     *
     * Constraints:
     * - m == board.length
     * - n == board[i].length
     * - 1 <= m, n <= 200
     * - board[i][j] is 'X' or 'O'.
     */
    private static boolean[][] visited;
    private static int m;
    private static int n;

    public static void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];

        System.out.println("m x n: "+ m +", "+ n);

        for(int i = 0; i < m; i++) {
            if(board[i][0] == 'O' && visited[i][0] == false) {
                findRegion(board, i, 0);
            }
        }

        for(int i = 0; i < n; i++) {
            if(board[m-1][i] == 'O' && visited[m-1][i] == false) {
                findRegion(board, m-1, i);
            }
        }

        for(int i = 0; i < n; i++) {
            if(board[0][i] == 'O' && visited[0][i] == false) {
                findRegion(board, 0, i);
            }
        }

        for(int i = 0; i < m; i++) {
            if(board[i][n-1] == 'O' && visited[i][n-1] == false) {
                findRegion(board, i, n-1);
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'O' && visited[i][j] == false) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private static void findRegion(char[][] board, int i, int j) {
        if(0 <= i && i < m && 0 <= j && j < n) {
            if(board[i][j] == 'O' && visited[i][j] == false) {
                visited[i][j] = true;
                findRegion(board, i-1, j);
                findRegion(board, i+1, j);
                findRegion(board, i, j-1);
                findRegion(board, i, j+1);
            }
        }
    }
}
