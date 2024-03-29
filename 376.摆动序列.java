/*
 * @lc app=leetcode.cn id=376 lang=java
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int up = 1, down = 1;
        if(nums.length == 0) return 0;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]) down = up + 1;
            else if(nums[i] > nums[i-1]) up = down + 1;
        }
        return Math.max(up, down);
    }
}
// @lc code=end

