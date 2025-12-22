package Solution;

public class Squares_of_a_Sorted_Array {
    //977. Squares of a Sorted Array - https://leetcode.com/problems/squares-of-a-sorted-array/description/
    public static int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        int left = 0;
        int right = nums.length-1;

        quickSort(left, right, nums);

        return nums;
    }

    public static void quickSort(int left, int right, int[] nums){

        int part = partition(left, right, nums);

        if(left < part -1 )
            quickSort(left, part - 1, nums);
        if(part < right)
            quickSort(part, right, nums);
    }

    public static int partition(int left, int right, int[] nums) {

        int mid = nums[(left + right)/2];

        while(left <= right) {

            while (nums[left] < mid) left++;
            while (nums[right] > mid) right--;

            if(left <= right) {
                swap(left, right, nums);
                left++;
                right--;
            }
        }

        return left;
    }

    public static void swap(int left, int right, int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
