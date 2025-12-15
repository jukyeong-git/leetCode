package Solution;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_II_Input_Array_Is_Sorted {
    //167. Two Sum II - Input Array Is Sorted - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {

            int total = numbers[left] + numbers[right];

            if(total == target) {
                return new int[]{left+1, right+1};
            }

            if(total <= target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
