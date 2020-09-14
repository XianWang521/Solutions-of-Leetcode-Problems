/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
        
        int result = 0, flag = (dividend>0&&divisor>0) || (dividend<0&&divisor<0)?1:-1;
		dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        
        while(dividend <= divisor) {
			int temp = divisor, times = 1;
			while(dividend-temp <= temp) {
                times = times<<1;
                temp = temp<<1;
			}
			dividend -= temp;
			result += times;
        }
        return result*flag;
    }
}
// @lc code=end

