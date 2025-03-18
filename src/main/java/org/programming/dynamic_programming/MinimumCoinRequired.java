package org.programming.dynamic_programming;

import java.util.Arrays;

class MinimumCoinRequired {
     public static void main(String[] args) {
         int[] coins = {1, 2, 5};
         int amount = 11;
         int result = minCoins(coins, amount);
         System.out.println("Minimum coins needed: " + result);
     }


     public static int minCoins(int[] coins, int amount) {
         int max = amount + 1;
         int[] dp = new int[amount + 1];
         Arrays.fill(dp,max);
         dp[0] = 0; // Base case: 0 coins for amount 0
         for (int i = 1; i <= amount; i++) {
             for (int coin : coins) {
                 if (i >= coin) {
                     dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                 }
             }
         }

         return (dp[amount] == max) ? -1 : dp[amount]; // -1 if no solution exists
     }
 }
