package Solution;

public class RemoveDuplicatesfromSortedArrayII {
    //80. Remove Duplicates from Sorted Array II - https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description
    public static int removeDuplicates(int[] nums) {
        if (nums == null) return 0;

        int n = nums.length;
        if (n <= 2) return n;

        int write = 2;
        for (int read = 2; read < n; read++) {
            if (nums[read] != nums[write - 2]) {
                nums[write++] = nums[read];
            }
        }

        return write;
    }
}
