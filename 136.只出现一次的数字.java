/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
// Written after checking the answer
// a xor 0 = a, a xor a = 0, a xor b xor a = 0 xor b = b
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++)
            res = res ^ nums[i];
        return res;
    }
}
// My solution
/*
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == null) map.put(nums[i], 1);
            else map.put(nums[i], 2);
        }

        for(int i = 0; i < nums.length; i++)
            if(map.get(nums[i]) == 1) return nums[i];
        return 0;
    }
}
*/
// @lc code=end

