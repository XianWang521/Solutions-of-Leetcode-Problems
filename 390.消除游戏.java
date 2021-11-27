/*
 * @lc app=leetcode.cn id=390 lang=java
 *
 * [390] 消除游戏
 */

// @lc code=start
// Refer from others
// f(2 * k + 1) = f(2 * k) = 2 * (k + 1 - f(k))
class Solution {
    public int lastRemaining(int n) {
        if(n == 1) return 1;
        return 2 * (n / 2 + 1 - lastRemaining(n / 2));
    }
}
// @lc code=end
