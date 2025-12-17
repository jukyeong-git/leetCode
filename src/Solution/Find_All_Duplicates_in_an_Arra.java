package Solution;

import java.util.*;

public class Find_All_Duplicates_in_an_Arra {
    //442. Find All Duplicates in an Array - https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums) {
            if(!set.contains(num))
                set.add(num);
            else
                result.add(num);
        }

        return result;
    }
}
