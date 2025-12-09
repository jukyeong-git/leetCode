package Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class H_Index {
    public static int hIndex(int[] citations) {

        int n = citations.length, idx = 0;

        Arrays.sort(citations);

        for(int i = 0; i < n; i++) {
            int h = n - i;
            if(citations[i] >= h) {
                return h;
            }
        }

        return -1;
    }
}
