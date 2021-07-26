import java.util.List;

/*
 * @lc app=leetcode.cn id=139 lang=java
 *
 * [139] 单词拆分
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];

        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j <= i; j++){
                if(j == i){
                    dp[i] = wordDict.contains(s.substring(i-j, i));
                    break;
                }
                else dp[i] = dp[i-j] && wordDict.contains(s.substring(i-j, i));
                if(dp[i]) break;
            }
        }
        return dp[s.length()];
    }
}
// @lc code=end

