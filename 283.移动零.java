/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        while(r < nums.length){
            if(nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
            r++;
        }
    }
}
// @lc code=end

