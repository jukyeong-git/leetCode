package Solution;

public class Climbing_Stairs {
    //70. Climbing Stairs - https://leetcode.com/problems/climbing-stairs/description/
    public static int climbStairs(int n) {
        int[] clib = new int[n + 1];

        clib[0] = 1;
        clib[1] = 1;

        for(int i = 2; i <= n; i++) {
            clib[i] = clib[i - 1] + clib[i - 2];
        }

        return clib[n];
    }
}
