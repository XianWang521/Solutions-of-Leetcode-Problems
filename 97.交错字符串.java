/*
 * @lc app=leetcode.cn id=97 lang=java
 *
 * [97] 交错字符串
 */

// @lc code=start
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean[] res = new boolean[s2.length()+1];
        if(s1.length() + s2.length() != s3.length()) return false;

        res[0] = true;
        for(int i = 0; i <= s1.length(); i++){
            for(int j = 0; j <= s2.length(); j++){
                if(i > 0) res[j] = res[j] && (s1.charAt(i-1) == s3.charAt(i+j-1));
                if(j > 0) res[j] = res[j] || (res[j-1] && (s2.charAt(j-1) == s3.charAt(i+j-1)));
            }
        }
        return res[s2.length()];
    }
}
// @lc code=end

