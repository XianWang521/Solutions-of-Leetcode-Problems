/*
 * @lc app=leetcode.cn id=32 lang=java
 *
 * [32] 最长有效括号
 */

// @lc code=start
class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length();
        int[] dp = new int[len];
        int res = 0;
        
        for(int i = 1; i < len; i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i-1) == '('){
                    if(i >= 2) dp[i] = dp[i-2]+2;
                    else dp[i] = 2;
                }
                else if(i-dp[i-1] > 0 && s.charAt(i-dp[i-1]-1) == '('){
                    if(i-dp[i-1] >= 2) dp[i] = dp[i-1]+dp[i-dp[i-1]-2]+2;
                    else dp[i] = dp[i-1]+2;
                }
                if(res < dp[i]) res = dp[i];
            }
        }
        return res;
    }
}
// @lc code=end
