/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int a = 0, b = 0, res = 1;
        for(int i = 1; i <= n; i++){
            a = b;
            b = res;
            res = a + b;
        }
        return res;
    }
}
// @lc code=end

