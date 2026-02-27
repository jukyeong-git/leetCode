package com.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    //77. Combinations - https://leetcode.com/problems/combinations/description/

    /*
     * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
     *
     * You may return the answer in any order.
     *
     * Example 1:
     *      Input: n = 4, k = 2
     *      Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
     * Explanation:
     *      There are 4 choose 2 = 6 total combinations.
     *      Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
     *
     * Example 2:
     *      Input: n = 1, k = 1
     *      Output: [[1]]
     * Explanation:
     *      There is 1 choose 1 = 1 total combination.
     *
     * Constraints:
     *      1 <= n <= 20
     *      1 <= k <= n
     */
    private static List<List<Integer>> res;

    public static List<List<Integer>> combine(int n, int k) {

        res = new ArrayList<>();
        setComb(1, n, k, new ArrayList<>());

        return res;
    }

    private static void setComb(int idx, int n, int k, List<Integer> subRes) {

        if(subRes.size() == k) {
            res.add(new ArrayList<>(subRes));
            return;
        }

        for(int i = idx; i <= n; i++) {
            subRes.add(i);
            setComb(i + 1, n, k, subRes);
            subRes.remove(subRes.size() - 1);
        }
    }
}
