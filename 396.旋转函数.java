/*
 * @lc app=leetcode.cn id=396 lang=java
 *
 * [396] 旋转函数
 */

// @lc code=start
class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int[] dp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            dp[0] += nums[i] * i;
        }

        int res = dp[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = dp[i-1] + sum - nums.length * nums[nums.length-i];
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
// @lc code=end

