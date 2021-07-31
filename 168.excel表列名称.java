/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while(columnNumber > 0){
            res.append((char)('A' + (columnNumber-1)%26));
            columnNumber = (columnNumber - 1) / 26;
        }
        return res.reverse().toString();
    }
}
// @lc code=end

