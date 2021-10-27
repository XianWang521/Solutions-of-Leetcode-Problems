/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for(int i = 1; i <= amount; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j : coins)
                if(i - j >= 0 && dp[i - j] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i - j] + 1);
        }
        
        return dp[amount] == Integer.MAX_VALUE? -1: dp[amount];
    }
}
// @lc code=end

