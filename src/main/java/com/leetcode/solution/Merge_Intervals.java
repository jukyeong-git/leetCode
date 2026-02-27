package com.leetcode.solution;

import java.util.*;

public class Merge_Intervals {
    //56. Merge Intervals - https://leetcode.com/problems/merge-intervals/description/

    /*
     * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
     *
     * Example 1:
     *      Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
     *      Output: [[1,6],[8,10],[15,18]]
     * Explanation:
     *      Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
     *
     * Example 2:
     *      Input: intervals = [[1,4],[4,5]]
     *      Output: [[1,5]]
     * Explanation:
     *      Intervals [1,4] and [4,5] are considered overlapping.
     *
     * Example 3:
     *      Input: intervals = [[4,7],[1,4]]
     *      Output: [[1,7]]
     * Explanation:
     *      Intervals [1,4] and [4,7] are considered overlapping.
     *
     * Constraints:
     *      1 <= intervals.length <= 104
     *      intervals[i].length == 2
     *      0 <= starti <= endi <= 104
     */
    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int []> list = new ArrayList<>();

        for(int i = 1; i < n; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];
            if (s <= end) {
                end = Math.max(end, e);
            } else {
                list.add(new int[]{start, end});
                start = s;
                end = e;
            }
        }
        list.add(new int[]{start, end});

        return list.toArray(new int[list.size()][]);
    }
}
