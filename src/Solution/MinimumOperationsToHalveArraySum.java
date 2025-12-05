package Solution;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumOperationsToHalveArraySum {
    //2208. Minimum Operations to Halve Array Sum - https://leetcode.com/problems/minimum-operations-to-halve-array-sum/
    public static int halveArray(int[] nums) {
        int count = 0;
        double sum = 0, target = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums) {
            sum += num;
            pq.offer((double)num);
        }

        target = sum / 2.0;

        while(sum > target) {
            double curr = pq.poll();
            double half = curr / 2.0;
            sum -= half;
            pq.offer(half);
            count++;
        }

        return count;
    }
}
