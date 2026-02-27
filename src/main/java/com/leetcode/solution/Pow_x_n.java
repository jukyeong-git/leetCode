package com.leetcode.solution;

public class Pow_x_n {
    //50. Pow(x, n) - https://leetcode.com/problems/powx-n/description/

    /*
     * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
     *
     * Example 1:
     *      Input: x = 2.00000, n = 10
     *      Output: 1024.00000
     *
     * Example 2:
     *      Input: x = 2.10000, n = 3
     *      Output: 9.26100
     *
     * Example 3:
     *      Input: x = 2.00000, n = -2
     *      Output: 0.25000
     * Explanation:
     *      2-2 = 1/22 = 1/4 = 0.25
     *
     * Constraints:
     *      -100.0 < x < 100.0
     *      -231 <= n <= 231-1
     *      n is an integer.
     *      Either x is not zero or n > 0.
     *      -104 <= xn <= 104
     */
    public static double myPow(double x, int n) {
        return pow(x, (long) n);
    }

    private static double pow(double x, long n){

        // 케이스 1: n이 0이면 무조건 1
        // x^0 = 1 (수학적 정의)
        if(n == 0) return 1;

        // 케이스 2: n이 음수이면 x → 1/x 로 바꾸고 n을 양수로
        // x^(-3) = (1/x)^3
        if(n < 0) return pow(1/x, -n);

        // 케이스 3: n이 짝수이면
        // x^8 = (x²)^4  →  절반씩 줄여나감
        if(n % 2 ==0) return pow(x * x, n / 2);

        // 케이스 4: n이 홀수이면
        // x^7 = (x²)^3 × x  →  1개 떼어내고 나머지는 짝수로
        return pow(x * x, (n - 1)/2) * x;
    }
}
