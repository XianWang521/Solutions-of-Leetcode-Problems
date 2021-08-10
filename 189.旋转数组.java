/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int pos = k % nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0, pos-1, nums);
        reverse(pos, nums.length-1, nums);
    }

    private void reverse(int start, int end, int[] nums){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /*
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            temp[(i+k)%nums.length] = nums[i];
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
    */
}
// @lc code=end

