/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int max_index = nums.length-1, min_index = 0;
        if(nums.length == 1) return;

        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                min_index = i;
                break;
            }
        }
        for(int j = nums.length-1; j > min_index; j--){
            if(nums[j] > nums[min_index]){
                max_index = j;
                break;
            }
        }
        
        swag(nums, min_index, max_index);

        int j = nums.length-1;
        while(j > min_index){
            for(int i = min_index+1; i<j; i++){
                if(nums[i] > nums[i+1]){
                    swag(nums, i, i+1);
                }
            }
            j--;
        }
    }

    public void swag(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

