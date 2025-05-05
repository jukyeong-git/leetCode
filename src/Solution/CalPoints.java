package Solution;

import java.util.Stack;

public class CalPoints {
    //682. Baseball Game - https://leetcode.com/problems/baseball-game/description/
    public int calPoints(String[] operations) {

        int[] stk = new int[operations.length];
        int index = 0;
        int result = 0;

        for(String c : operations) {

            switch(c) {
                case "+":
                    stk[index] = stk[index-1] + stk[index-2];
                    index++;
                    break;
                case "C":
                    index--;
                    break;
                case "D":
                    stk[index] = stk[index-1] * 2;
                    index++;
                    break;
                default:
                    stk[index] = Integer.parseInt(c);
                    index++;
                    break;
            }
        }

        for(int i = 0; i <= index; i++) {
            result += stk[i];
        }

        return result;
    }
}
