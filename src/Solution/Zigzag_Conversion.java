package Solution;

import java.util.ArrayList;
import java.util.List;

public class Zigzag_Conversion {
    //6. Zigzag Conversion - https://leetcode.com/problems/zigzag-conversion/
    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder result = new StringBuilder();
        List<StringBuilder> rows = new ArrayList<>();

        int idx = 0;
        int dir = -1;

        for(int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        for(char c : s.toCharArray()) {
            rows.get(idx).append(c);
            if(idx == 0 || idx == numRows - 1) dir = -dir;
            idx += dir;
        }

        for(StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
