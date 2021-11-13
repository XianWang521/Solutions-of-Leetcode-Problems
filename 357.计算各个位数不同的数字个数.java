/*
 * @lc app=leetcode.cn id=357 lang=java
 *
 * [357] 计算各个位数不同的数字个数
 */

// @lc code=start
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        if(n == 0) return dp[n];
        
        dp[1] = 10;
        /* The number of x between i-1 digits and i-2 digits 
        is multiplied by the remaining optional digits to form a new digit x */
        for(int i = 2; i <= n; i++) dp[i] = dp[i-1] + (dp[i-1]-dp[i-2]) * (11-i);

        return dp[n];
    }
}
// @lc code=end

