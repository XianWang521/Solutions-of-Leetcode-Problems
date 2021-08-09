/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid  = (right - left) / 2 + left;
            if(nums[mid] < nums[mid+1]) left = mid + 1;
            else right = mid;
            if(left == right) break;
        }
        return left;
    }
}
// @lc code=end

