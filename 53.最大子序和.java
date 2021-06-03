/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start

/* dp: time complexity: O(N)*/

class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0], temp = 0;
        for(int i = 0; i < nums.length; i++){
            temp = Math.max(nums[i] + temp, nums[i]);
            res = Math.max(temp, res);
        }
        return res;
    }
}
// @lc code=end

