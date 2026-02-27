package com.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class Word_Search {
    //79. Word Search - https://leetcode.com/problems/word-search/description/

    /*
     * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
     *
     * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring.
     * The same letter cell may not be used more than once.
     *
     * Example 1:
     *      Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
     *      Output: true
     *
     * Example 2:
     *      Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
     *      Output: true
     *
     * Example 3:
     *      Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
     *      Output: false
     *
     * Constraints:
     *      m == board.length
     *      n = board[i].length
     *      1 <= m, n <= 6
     *      1 <= word.length <= 15
     *      board and word consists of only lowercase and uppercase English letters.
     *
     * Follow up:
     *      Could you use search pruning to make your com.leetcode.solution faster with a larger board?
     */
    private static int rows;
    private static int cols;
    private static boolean[][] visited;

    public static boolean exist(char[][] board, String word) {

        rows = board.length;
        cols = board[0].length;
        visited = new boolean[rows][cols];

        Map<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        if(map.get(word.charAt(0)) > map.get(word.charAt(word.length() - 1))) {
            word = new StringBuilder(word).reverse().toString();
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(dfs(0, i, j, board, word))
                    return true;
            }
        }

        return false;
    }

    private static boolean dfs(int count, int row, int col, char[][] board, String word) {
        if(count == word.length())
            return true;

        if(row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || board[row][col] != word.charAt(count)) {
            return false;
        }

        visited[row][col] = true;
        boolean res = dfs(count + 1, row - 1, col, board, word) ||
                      dfs(count + 1, row + 1, col, board, word) ||
                      dfs(count + 1, row, col - 1, board, word) ||
                      dfs(count + 1, row, col + 1, board, word);
        visited[row][col] = false;
        return res;
    }
}
