/*
 * @lc app=leetcode.cn id=233 lang=java
 *
 * [233] 数字 1 的个数
 */

// @lc code=start
// Refer from others' solution
class Solution {
    public int countDigitOne(int n) {
        int res = 0;
        
        for(int i = 1; i <= n; i *= 10)
            res += (n / (i * 10)) * i + Math.min(Math.max(0, (n % (i * 10) - i + 1)), i);
        
        return res;
    }
}
// @lc code=end

