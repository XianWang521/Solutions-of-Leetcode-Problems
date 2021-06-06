/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int maxindex = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(i <= maxindex){
                maxindex = Math.max(maxindex, i+nums[i]);
                if(maxindex >= nums.length-1) return true;
            }
        }
        return false;
    }
}
// @lc code=end

