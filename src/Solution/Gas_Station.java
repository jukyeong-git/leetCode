package Solution;

public class Gas_Station {
    //134. Gas Station - https://leetcode.com/problems/gas-station/description/
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;
        int currentGas = 0, start = 0, n = gas.length;

        for(int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas < totalCost) return -1;

        for(int i = 0; i < n; i++) {
            currentGas += gas[i] - cost[i];
            if(currentGas < 0) {
                currentGas = 0;
                start = start + i;
            }
        }

        return start;
    }
}
