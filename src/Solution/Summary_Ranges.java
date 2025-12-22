package Solution;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    //228. Summary Ranges - https://leetcode.com/problems/summary-ranges/description/
    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        int index = 0;

        while(index < nums.length) {

            int start = nums[index];

            while(index < nums.length-1 && nums[index]+1 == nums[index+1])
                index ++;

            if(start != nums[index])
                result.add(start+"->"+nums[index]);
            else
                result.add(String.valueOf(start));

            index++;
        }

        return result;
    }
}
