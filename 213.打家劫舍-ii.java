/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        else if(nums.length == 2) return Math.max(nums[0], nums[1]);
        // 0 - n-2
        int round1 = robcircle(nums, 0, nums.length-2);
        // 1 - n-1
        int round2 = robcircle(nums, 1, nums.length-1);
        return Math.max(round1, round2);
    }

    private int robcircle(int[] nums, int start, int end){
        int first = nums[start], second = Math.max(nums[start], nums[start+1]);
        start += 2;
        while(start <= end){
            int temp = second;
            second = Math.max(first+nums[start], temp);
            first = temp;
            start++;
        }
        return second;
    }
}
// @lc code=end

