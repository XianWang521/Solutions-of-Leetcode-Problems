import java.util.ArrayList;
import java.util.Random;

/*
 * @lc app=leetcode.cn id=398 lang=java
 *
 * [398] 随机数索引
 */

// @lc code=start
// Reservoir Sampling
class Solution {
    private int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int pick(int target) {
        Random r = new Random();
        int idx = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                count++;
                if(r.nextInt(count) == 0) idx = i;
            }
        }
        return idx;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
// @lc code=end

