/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子数组
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int maxn = nums[0], minn = nums[0], res = nums[0];
        int maxtemp, mintemp;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= 0){
                maxtemp = Math.max(nums[i], nums[i] * maxn);
                mintemp = Math.min(nums[i], nums[i] * minn);
            }
            else{
                maxtemp = Math.max(nums[i], nums[i] * minn);
                mintemp = Math.min(nums[i], nums[i] * maxn);
            }
            maxn = maxtemp;
            minn = mintemp;
            res = Math.max(maxn, res);
        }
        return res;
    }
}
// @lc code=end

