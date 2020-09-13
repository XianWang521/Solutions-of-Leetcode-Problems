/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        if(target<=nums[0]) return 0;
        for(i=1;i<nums.length;i++) {
            if(nums[i]>=target&&nums[i-1]<target) break;
        }
        return i;
    }
}
// @lc code=end

