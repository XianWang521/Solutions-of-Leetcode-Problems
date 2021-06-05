import jdk.internal.jshell.tool.resources.l10n;

/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if(n > 0) return comp(x, n);
        else return 1.0/comp(x, n);
    }
    public double comp(double x, int n){
        if(n == 0) return 1.0;
        double y = comp(x, n / 2);
        if(n % 2 == 0) return y*y;
        else return y*y*x;
    }
}
// @lc code=end

