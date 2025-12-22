package Solution;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {
    //202. Happy Number - https://leetcode.com/problems/happy-number/description/
    public static boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while(true) {
            int sum = 0;

            while(n != 0) {
                sum += (int) Math.pow(n%10, 2.0);
                n = n/10;
            }

            if(sum == 1)
                return true;

            n = sum;

            if(set.contains(n))
               return false;
            set.add(n);
        }
    }
}
