package Solution;

import java.util.Arrays;

public class Coin_Change {
    //322. Coin Change - https://leetcode.com/problems/coin-change/description/

    /*
     * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
     * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
     * You may assume that you have an infinite number of each kind of coin.
     *
     * Example 1:
     *      Input: coins = [1,2,5], amount = 11
     *      Output: 3
     * Explanation:
     *      11 = 5 + 5 + 1
     *
     * Example 2:
     *      Input: coins = [2], amount = 3
     *      Output: -1
     *
     * Example 3:
     *      Input: coins = [1], amount = 0
     *      Output: 0
     *
     * Constraints:
     *      1 <= coins.length <= 12
     *      1 <= coins[i] <= 231 - 1
     *      0 <= amount <= 104
    */
    public static int coinChange(int[] coins, int amount) {

        // 1. DP 배열 생성 (인덱스 0부터 amount까지 필요하므로 크기는 amount + 1)
        int[] minCoins = new int[amount + 1];

        // 2. 배열을 만들 수 없는 최댓값(amount + 1)으로 초기화
        Arrays.fill(minCoins, amount + 1);

        // 3. 기저 조건: 금액 0을 만드는 데 필요한 동전은 0개
        minCoins[0] = 0;

        // 4. 1원부터 목표 금액(amount)까지 순차적으로 최소 동전 개수 계산
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                // 현재 동전을 사용할 수 있는 경우 (금액이 마이너스가 되지 않는 경우)
                if (i - coins[j] >= 0) {
                    // 기존 최소 개수와 (현재 동전 1개 + 남은 금액을 만드는 최소 개수) 중 최솟값 갱신
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coins[j]]);
                }
            }
        }

        // 5. 최종 금액의 값이 초기값(amount + 1) 그대로라면 불가능한 경우이므로 -1 반환
        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;
    }
}
