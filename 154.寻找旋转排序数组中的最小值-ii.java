/*
 * @lc app=leetcode.cn id=154 lang=java
 *
 * [154] 寻找旋转排序数组中的最小值 II
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = (right - left) / 2 + left;
            if(nums[mid] > nums[right]) left = mid + 1;
            else if(nums[mid] < nums[right]) right = mid;
            else right--;
        }
        return nums[left];
    }
}
// @lc code=end

