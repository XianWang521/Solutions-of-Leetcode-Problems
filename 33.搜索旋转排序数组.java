/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) return -1;
        else if(len == 1) return (nums[0] == target)? 0: -1;

        int l = 0, r = len-1;
        while(l <= r){
            int m = (l+r)/2;
            if(nums[m] == target) return m;
            if(nums[0] <= nums[m]){
              if(nums[0] <= target && target < nums[m]) r = m-1;
              else l = m+1;
            }
            else{
                if(nums[m] < target && target <= nums[len-1]) l = m+1;
                else r = m-1;
            }
        }
        return -1;
    }
}
// @lc code=end

