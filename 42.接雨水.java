/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int res = 0;
        int left = 0, right = 0, i = 0, j = height.length - 1;
        while(i < j){
            left = Math.max(height[i], left);
            right = Math.max(height[j], right);
            if(height[i] < height[j]){
                res += left - height[i];
                i++;
            }
            else{
                res += right - height[j];
                j--;
            }
        }
        return res;
    }
}
// @lc code=end

