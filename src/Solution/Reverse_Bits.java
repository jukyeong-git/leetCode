package Solution;

public class Reverse_Bits {
    //190. Reverse Bits - https://leetcode.com/problems/reverse-bits/description/

    /*
     * Reverse bits of a given 32 bits signed integer.
     *
     * Example 1:
     *      Input: n = 43261596
     *      Output: 964176192
     * Explanation:
     *      Integer	Binary
     *      43261596	00000010100101000001111010011100
     *      964176192	00111001011110000010100101000000
     *
     * Example 2:
     *      Input: n = 2147483644
     *      Output: 1073741822
     * Explanation:
     *      Integer	Binary
     *      2147483644	01111111111111111111111111111100
     *      1073741822	00111111111111111111111111111110
     *
     * Constraints:
     *      0 <= n <= 231 - 2
     *      n is even.
     * Follow up: If this function is called many times, how would you optimize it?
     */
    public static int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans <<= 1;              // 1) ans를 왼쪽으로 한 칸 이동(자리 만들기)
            ans = ans | (n & 1);    // 2) n의 LSB(최하위비트)를 ans의 LSB에 붙이기
            n >>>= 1;               // 3) n을 오른쪽으로 한 칸 이동(다음 비트 준비)
        }

        return ans;
    }
}
