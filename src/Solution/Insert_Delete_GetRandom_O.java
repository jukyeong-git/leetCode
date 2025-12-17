package Solution;

import java.util.*;

public class Insert_Delete_GetRandom_O {
    //380. Insert Delete GetRandom O(1) - https://leetcode.com/problems/insert-delete-getrandom-o1/description/
    List<Integer> list;
    public Insert_Delete_GetRandom_O() {
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(!list.contains(val)) {
            list.add(val);
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(int val) {
        if(list.contains(val)) {
            list.remove(Integer.valueOf(val));
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        int idx = (int)(Math.random()*list.size());
        return list.get(idx);
    }
}
