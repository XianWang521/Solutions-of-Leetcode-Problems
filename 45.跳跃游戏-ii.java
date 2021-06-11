/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int pos = 0, count = 0;
        while(pos < nums.length-1){
            if(pos + nums[pos] >= nums.length-1){
                count++;
                break;
            }
            int temp = 0, index = 0;
            for(int i = pos+1; i <= nums[pos]+pos; i++){
                if(nums[i] + i > temp){
                    temp = nums[i] + i;
                    index = i;
                }
            }
            pos = index;
            count++;
        }
        
        return count;
    }
}
// @lc code=end

