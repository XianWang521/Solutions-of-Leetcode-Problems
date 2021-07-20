/*
 * @lc app=leetcode.cn id=132 lang=java
 *
 * [132] 分割回文串 II
 */

// @lc code=start
class Solution {
    public int minCut(String s) {
        if(s.length() == 0) return 0;
        char[] ss = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int j = 0; j < s.length(); j++){
            for(int i = j; i >= 0; i--){
                if(i == j) dp[i][j] = true;
                else if(j - i == 1) dp[i][j] = (ss[i] == ss[j]);
                else dp[i][j] = (ss[i] == ss[j]) && dp[i+1][j-1];
            }
        }

        int[] res = new int[s.length()];
        for(int i = 0; i < s.length(); i++) res[i] = i;
        for(int i = 0; i < s.length(); i++){
            if(dp[0][i]){
                res[i] = 0;
                continue;
            }
            for(int j = 0; j < i; j++)
                if(dp[j+1][i]) res[i] = Math.min(res[i], res[j]+1);
        }
        return res[s.length()-1];
    }
}
// @lc code=end

