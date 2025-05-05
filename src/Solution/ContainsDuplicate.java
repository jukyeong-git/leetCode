package Solution;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    //217. Contains Duplicate - https://leetcode.com/problems/contains-duplicate/description/
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) >= 2)
                return true;
        }

        return false;
    }
}
