/*
 * @lc app=leetcode.cn id=371 lang=java
 *
 * [371] 两整数之和
 */

// @lc code=start
// carry =  (a & b) << 1
// sum = carry + a ^ b
class Solution {
    public int getSum(int a, int b) {
        return b != 0? getSum(a ^ b, (a & b) << 1): a;
    }
}
// @lc code=end

