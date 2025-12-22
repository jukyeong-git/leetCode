package Solution;

import java.util.*;

public class Merge_Intervals {
    //56. Merge Intervals - https://leetcode.com/problems/merge-intervals/description/
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
