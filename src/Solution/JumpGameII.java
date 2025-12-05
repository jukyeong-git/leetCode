package Solution;

public class JumpGameII {
    //45. Jump Game II - https://leetcode.com/problems/jump-game-ii/description/
    public static int jump(int[] nums) {
        int count = 0, n = nums.length - 1;
        int near = 0, far = 0, fastest = 0;

        while(far < n) {
            for(int i = near; i <= far; i++){
                fastest = Math.max(fastest, i+nums[i]);
            }
            near = far + 1;
            far = fastest;
            count ++;
        }

        return count;
    }
}
