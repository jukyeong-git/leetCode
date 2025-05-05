package Solution;

import javax.swing.*;

public class Search {
    //704. Binary Search - https://leetcode.com/problems/binary-search/description/
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] <= target)
                start = mid+1;
            else
                end = mid-1;
        }

        return -1;
    }
}
