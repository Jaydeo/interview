package org.programming.dynamic_programming;

public class CoinChangeWays {
    public static int countWays(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // One way to make amount 0 (by taking no coins)

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin]; // Include ways to form (i - coin)
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int ways = countWays(coins, amount);
        System.out.println("Total ways to make " + amount + ": " + ways);
    }
}
