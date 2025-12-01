package Solution;

public class JumpGame {
    //55. Jump Game - https://leetcode.com/problems/jump-game/description/
    public static boolean canJump(int[] nums) {
        int reach = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(reach < i) return false;
            reach = Math.max(reach, i + nums[i]);
            if(reach >= n) return true;
        }

        return true;
    }
}
