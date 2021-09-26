/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 丢失的数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int total = nums.length * (nums.length + 1) / 2;
        for(int i : nums) total -= i;
        return total;
    }
}
/*
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;

        if(nums[0] != 0) return 0;
        else if(nums[nums.length-1] != nums.length) return nums.length;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                res = i;
                break;
            }
        }    
        return res;
    }
}
*/
// @lc code=end

