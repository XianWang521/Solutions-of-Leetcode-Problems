/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        long temp = num / 2;

        while(temp * temp > num)
            temp = (temp + num / temp) / 2;
        return temp * temp == num;
    }
}
// @lc code=end

