import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++)
            if(temp.contains(nums[i])) return true;
            else temp.add(nums[i]);
        return false;
    }
}
// @lc code=end

