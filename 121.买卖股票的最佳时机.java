/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int temp = Integer.MAX_VALUE, res = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < temp) temp = prices[i];
            if(prices[i] - temp >= res) res = prices[i] - temp;
        }
        return res;
    }
}
// @lc code=end

