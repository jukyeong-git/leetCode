package Solution;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate {
    //217. Contains Duplicate - https://leetcode.com/problems/contains-duplicate/description/
    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) >= 2)
                return true;
        }

        return false;
    }
}
