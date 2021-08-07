/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (right - left) / 2 + left;
            if(nums[mid] < nums[right]) right = mid;
            else left = mid+1;
        }
        return nums[left];
    }
}
// @lc code=end

