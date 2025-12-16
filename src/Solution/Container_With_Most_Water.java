package Solution;

public class Container_With_Most_Water {
    //11. Container With Most Water - https://leetcode.com/problems/container-with-most-water/description/
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxTotal = 0;

        while(left < right) {
            int wid = right - left;
            int hei = Math.min(height[left], height[right]);
            maxTotal = Math.max(maxTotal, wid * hei);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxTotal;
    }
}
