/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int co=0,i=0,j=height.length-1;
        while(i<j)
        {
            co=Math.max(co,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]) i++;
            else j--;
        }
        return co;
    }
}
// @lc code=end

