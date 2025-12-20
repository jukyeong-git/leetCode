package Solution;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //1. Two Three_Sum - https://leetcode.com/problems/two-sum/description/
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++) {
            if(numsMap.get(target-nums[i]) != null && numsMap.get(target-nums[i]) != i){
                return new int[]{i, numsMap.get(target-nums[i])};
            }
        }

        return null;
    }
}
