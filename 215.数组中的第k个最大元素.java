/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int l = 0, r = nums.length-1;
        int idx;
        while(true){
            idx = quicksort(nums, l, r);
            if(idx == k-1) break;
            else if(idx > k-1) r = idx - 1;
            else l = idx + 1;
        }
        return nums[idx];
    }

    private int quicksort(int[] nums, int l, int r){
        int pviot = nums[l], start = l;
        while(l < r){
            while(nums[r] <= pviot && l < r) r--;
            while(nums[l] >= pviot && l < r) l++;
            if(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        nums[start] = nums[l];
        nums[l] = pviot;
        return l;   
    }
}
// @lc code=end

