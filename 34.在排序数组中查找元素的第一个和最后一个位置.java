/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l, r;
        if(nums.length == 1) return (nums[0] == target)? new int[]{0,0}: new int[]{-1,-1};
        
        l = binarySearch(nums, target, true);
        if(l == -1) return new int[]{-1,-1};
        r = binarySearch(nums, target, false);

        return new int[]{l,r};
    }

    public int binarySearch(int[] nums, int target, Boolean type){
        int l = 0, r = nums.length-1;
        while(l <= r){
            int m = (l+r)/2;
            if((type && nums[m] < target) || (!type && nums[m] <= target)) l = m+1;
            else r = m-1;
        }

        if(type){
            if(l != nums.length && nums[l] == target) return l;
            else return -1;
        }
        else return r;
    }
}
// @lc code=end

