package Solution;

public class Valid_Perfect_Square {
    //367. Valid Perfect Square - https://leetcode.com/problems/valid-perfect-square/description/
    public static boolean isPerfectSquare(int num) {

        int start = 1;
        int end = num;

        while(start <= end) {
            int m = (start + end) / 2;
            long mid = (long) m * m;

            if(mid == num)
                return true;
            else if(mid < num)
                start = m + 1;
            else
                end = m - 1;
        }

        return false;
    }
}
