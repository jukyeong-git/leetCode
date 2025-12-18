package Solution;

import java.util.Collections;
import java.util.PriorityQueue;

public class Last_Stone_Weight {
    //1046. Last Stone Weight - https://leetcode.com/problems/last-stone-weight/description/
    public static int lastStoneWeight(int[] stones) {

        //Solution #1
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int s : stones) {
            pq.offer(s);
        }

        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            if(first != second) {
                pq.offer(first-second);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();

        //Solution #2
        /*
        Arrays.sort(stones);

        for(int i = stones.length-1; i > 0; i--) {
            int diff = stones[i] - stones [i-1];
            stones[i-1] = diff;
            Arrays.sort(stones, 0, i);
        }

        return stones[0];
        */
    }
}
