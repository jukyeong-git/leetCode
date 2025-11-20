package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
    //88. Merge Sorted Array - https://leetcode.com/problems/merge-sorted-array/description/
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            nums1[m++] = nums2[i];
        }
        Arrays.sort(nums1);

        List<String> print = new ArrayList<>();
        for(int num : nums1) {
            print.add(Integer.toString(num));
        }

        System.out.println(Arrays.deepToString(print.toArray()));
    }
}
