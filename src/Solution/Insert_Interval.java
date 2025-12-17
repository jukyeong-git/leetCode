package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Insert_Interval {
    //57. Insert Interval - https://leetcode.com/problems/insert-interval/description/
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
