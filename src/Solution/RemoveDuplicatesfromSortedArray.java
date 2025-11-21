package Solution;

public class RemoveDuplicatesfromSortedArray {
    //26. Remove Duplicates from Sorted Array - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
    public static int removeDuplicates(int[] nums) {
        int j = 0;

        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] != nums[j])
                nums[++j] = nums[i];
        }

        return j + 1;
    }
}
