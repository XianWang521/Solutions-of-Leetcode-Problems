/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;
        int p = 2;
        for(int i = 2; i < nums.length; i++)
            if(nums[i] != nums[p-2]) nums[p++] = nums[i];
        return p;
    }
}
// @lc code=end

