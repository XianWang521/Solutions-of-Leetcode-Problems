/*
 * @lc app=leetcode.cn id=324 lang=java
 *
 * [324] 摆动排序 II
 */

// @lc code=start
class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] temp = nums.clone();
        int len = nums.length - 1;

        for(int i = 1; i < nums.length; i += 2) nums[i] = temp[len--];
        for(int i = 0; i < nums.length; i += 2) nums[i] = temp[len--];
    }
}
// @lc code=end

