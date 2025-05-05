package Solution;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
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
    }
}
