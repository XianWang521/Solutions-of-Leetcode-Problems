/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int i = 0; i < nums.length; i++)
            arr[nums[i]]++;
        for(int i = 0; i < nums.length; i++){
            if(i < arr[0]) nums[i] = 0;
            else if(i < arr[0]+arr[1]) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}
// @lc code=end

