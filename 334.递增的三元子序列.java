/*
 * @lc app=leetcode.cn id=334 lang=java
 *
 * [334] 递增的三元子序列
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;

        for(int i : nums){
            if(i < min) min = i;
            else if(i < mid && i > min) mid = i;
            else if(i > mid) return true;
        }
        return false;
    }
}
// @lc code=end

