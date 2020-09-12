/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        for(int i=0;i<haystack.length()-len+1;i++){
            if(haystack.substring(i, i+len).equals(needle)) return i;
        }
        return -1;
    }
}
// @lc code=end

