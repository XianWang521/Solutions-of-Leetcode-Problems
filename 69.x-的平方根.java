/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        double temp = x;
        while(true){
            double x1 = 0.5 * (temp+x/temp);
            if(Math.abs(x1 - temp) < 1e-7) break;
            temp = x1;
        }
        return (int)temp;
    }
}
// @lc code=end

