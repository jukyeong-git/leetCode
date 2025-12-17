package Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class H_Index {
    //274. H-Index - https://leetcode.com/problems/h-index/description/
    public static int hIndex(int[] citations) {

        int n = citations.length;

        Arrays.sort(citations);

        for(int i = 0; i < n; i++) {
            int h = n - i;
            if(citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}
