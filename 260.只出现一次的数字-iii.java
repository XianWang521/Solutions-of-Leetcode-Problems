/*
 * @lc app=leetcode.cn id=260 lang=java
 *
 * [260] 只出现一次的数字 III
 */

// @lc code=start
class Solution {
    public int[] singleNumber(int[] nums) {
        int temp = 0;
        int[] res = new int[2];
        res[0] = res[1] = 0;

        for(int i: nums) temp ^= i;
        // Get the lowest bit 1
        temp &= -temp;

        for(int i: nums){
            if((i & temp) == 0) res[0] ^= i;
            else res[1] ^= i;
        }
        return res;
    }
}
// @lc code=end

