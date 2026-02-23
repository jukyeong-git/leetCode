package Solution;

public class Factorial_Trailing_Zeroes {
    //172. Factorial Trailing Zeroes - https://leetcode.com/problems/factorial-trailing-zeroes/description/

    /*
     * Given an integer n, return the number of trailing zeroes in n!.
     * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
     *
     * Example 1:
     *      Input: n = 3
     *      Output: 0
     * Explanation:
     *      3! = 6, no trailing zero.
     *
     * Example 2:
     *      Input: n = 5
     *      Output: 1
     * Explanation:
     *      5! = 120, one trailing zero.
     *
     * Example 3:
     *      Input: n = 0
     *      Output: 0
     *
     * Constraints:
     *      0 <= n <= 104
     *      Follow up: Could you write a solution that works in logarithmic time complexity?
     */
    public static int trailingZeroes(int n) {

        if(n <= 4) return 0;

        int count = 0;

        for(long i = 5; n / i > 0; i *= 5) {
            count += n / i;
        }

        return count;
    }
}
