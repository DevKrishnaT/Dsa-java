package GreedyAlgo;

import java.util.Arrays;
import java.util.Collections;

public class CoinChange {
    static void main(String[] args) {
        int[] coins = {1, 3, 4};
        int amount = 9;
        int ans = coinChange(coins, amount);
        System.out.println(ans);
    }

    private static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}

