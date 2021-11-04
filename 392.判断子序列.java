/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int slength = s.length(), tlength = t.length();
        int i = 0, j = 0;
        while(i < slength && j < tlength){
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == slength;
    }
}
// @lc code=end

