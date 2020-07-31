/*
 * @lc app=leetcode.cn id=5 lang=cpp
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
public:
    string longestPalindrome(string s) {
        int i, j, k, start = 0, max_len = 1, len = s.size();
        vector<vector<int>> dp(len, vector<int>(len));
        if (s.empty())
            return "";
        else if (s.size() == 1)
            return s;
        
        // dp[i][j] represents whether the string from i to j is a palindrome 
        for (i = 0; i < len; i++)
        {
            dp[i][i] = 1;
            if (i < len - 1 && s[i] == s[i + 1])
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
                if (s[i] == s[k] && dp[i + 1][k - 1] == 1)
                {
                    dp[i][k] = 1;
                    start = i;
                    max_len = j;
                }
            }
        }
        return s.substr(start, max_len);
    }
};
// @lc code=end

