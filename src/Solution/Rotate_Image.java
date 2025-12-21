package Solution;

import java.util.Arrays;

public class Rotate_Image {
    //48. Rotate Image - https://leetcode.com/problems/rotate-image/description/
    public static void rotate(int[][] matrix) {

        int n = matrix.length - 1;

        //Convert from Row to Col
        for(int i = 0; i <= n; i ++) {
            for(int j = i; j <= n; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Swap
        for(int i = 0; i <= n; i ++) {
            for(int j = 0; j <= n/2; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j];
                matrix[i][n-j] = temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
