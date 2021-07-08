/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
        }

        for(int i = 0; i < nums.length; i++)
            if(map.get(nums[i]) == 1) return nums[i];
        return 0;
    }
}
// @lc code=end

