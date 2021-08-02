/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */

// @lc code=start
class Solution {
    public int titleToNumber(String columnTitle) {
        char[] character = columnTitle.toCharArray();
        int res = 0;
        
        for(char i:character)
            res = res * 26 + i - 'A' + 1;
        return res;
    }
}
// @lc code=end

