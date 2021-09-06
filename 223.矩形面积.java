/*
 * @lc app=leetcode.cn id=223 lang=java
 *
 * [223] 矩形面积
 */

// @lc code=start
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x2 = Math.min(ax2, bx2), y2 = Math.min(ay2, by2);
        int x1 = Math.max(ax1, bx1), y1 = Math.max(ay1, by1);
        
        int total = (ay2 - ay1) * (ax2 - ax1) + (bx2 - bx1) * (by2 - by1);
        if(x2 < x1 || y2 < y1) return total;
        
        int y = Math.abs(y2 - y1);
        int x = Math.abs(x2 - x1);
        return total - x * y;
    }
}
// @lc code=end

