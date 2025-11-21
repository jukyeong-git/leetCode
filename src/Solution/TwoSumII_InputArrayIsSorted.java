package Solution;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII_InputArrayIsSorted {
    //167. Two Sum II - Input Array Is Sorted - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i+1);
        }

        for(int i = 0; i < numbers.length; i++) {
            if(map.get(target-numbers[i]) != null && map.get(target-numbers[i]) != i)
                return new int[]{i+1, map.get(target-numbers[i])};
        }

        return new int[]{0, 0};
    }
}
