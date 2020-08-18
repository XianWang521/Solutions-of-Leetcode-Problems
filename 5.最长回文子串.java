/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int i, j, k, start = 0, max_len = 1, len = s.length();
        int [][] dp = new int[len][len];
        if (s.length()==0)
            return "";
        else if (s.length() == 1)
            return s;
        
        // dp[i][j] represents whether the string from i to j is a palindrome 
        for (i = 0; i < len; i++)
        {
            dp[i][i] = 1;
            if (i < len - 1 && s.charAt(i) == s.charAt(i+1))
            {
                dp[i][i + 1] = 1;
                max_len = 2;
                start = i;
            }
        }
        
        for (j = 3; j <= len; j++)
        {
            for (i = 0; i + j - 1 < len; i++)
            {
                k = i + j - 1;
                if (s.charAt(i) == s.charAt(k) && dp[i + 1][k - 1] == 1)
                {
                    dp[i][k] = 1;
                    start = i;
                    max_len = j;
                }
            }
        }
        return s.substring(start, start+max_len);
    }
}
// @lc code=end

