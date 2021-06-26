/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        for(int i = 1; i < prices.length; i++){
            int temp = Math.max(0, prices[i] - prices[i-1]);
            res += temp;
        }
        return res;
    }
}
// @lc code=end

