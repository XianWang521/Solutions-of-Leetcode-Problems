import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(temp.containsKey(nums[i]) && i - temp.get(nums[i]) <= k) return true;
            else temp.put(nums[i], i);
        }
        return false;
    }
}
// @lc code=end

