package Solution;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    //1. Two Sum - https://leetcode.com/problems/two-sum/description/
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i ++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
