package Solution;

public class Search_Insert_Position {
    //35. Search Insert Position - https://leetcode.com/problems/search-insert-position/description/
    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while(start <= end) {
            mid = (start + end) / 2;

            if(nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid -1;
            else
                return mid;
        }

        return start;
    }
}
