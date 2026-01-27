package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Insert_Interval {
    //57. Insert Interval - https://leetcode.com/problems/insert-interval/description/

    /*
     * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti.
     * You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
     * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
     * Return intervals after the insertion.
     * Note that you don't need to modify intervals in-place. You can make a new array and return it.
     *
     * Example 1:
     * - Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
     * - Output: [[1,5],[6,9]]
     *
     * Example 2:
     * - Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
     * - Output: [[1,2],[3,10],[12,16]]
     * Explanation:
     * - Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
     *
     * Constraints:
     * - 0 <= intervals.length <= 104
     * - intervals[i].length == 2
     * - 0 <= starti <= endi <= 105
     * - intervals is sorted by starti in ascending order.
     * - newInterval.length == 2
     * - 0 <= start <= end <= 105
     */
    public static int[][] insert(int[][] intervals, int[] newInterval) {

        if(intervals.length == 0) return new int[][]{newInterval};

        List<int []> list   = new ArrayList<>();
        List<int []> result = new ArrayList<>();
        int start = 0;
        int end   = 0;
        int n = intervals.length;

        for(int i = 0; i < n; i++) {
            list.add(intervals[i]);
        }

        list.add(newInterval);

        Collections.sort(list, (a, b) -> a[0] - b[0]);

        start = list.get(0)[0];
        end   = list.get(0)[1];

        for(int i = 1; i < list.size(); i++) {
            int s = list.get(i)[0];
            int e = list.get(i)[1];

            if(s <= end) {
                end = Math.max(e, end);
            } else {
                result.add(new int[]{start, end});
                start = s;
                end   = e;
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}
