/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        for(char i: s.toCharArray()) res ^= i;
        for(char i: t.toCharArray()) res ^= i;
        return (char)res;
    }
}
// @lc code=end

