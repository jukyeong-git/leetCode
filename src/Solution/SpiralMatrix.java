package Solution;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    //54. Spiral Matrix - https://leetcode.com/problems/spiral-matrix/description/
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int left = 0, right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;

        while(left <= right && top <= bottom) {
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }

        return result;
    }
}
