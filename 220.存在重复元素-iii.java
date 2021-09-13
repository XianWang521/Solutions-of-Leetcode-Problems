import java.util.TreeSet;

/*
 * @lc app=leetcode.cn id=220 lang=java
 *
 * [220] 存在重复元素 III
 */

// @lc code=start
// Refer from official solution
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            Long ceil = set.ceiling((long) nums[i] - (long) t);
            if(ceil != null && ceil <= (long) nums[i] + (long) t) return true;
            else set.add((long) nums[i]);
            if(i >= k) set.remove((long) nums[i - k]);
        }
        return false;
    }
}

// Some cases failed
/*
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i = 0; i < nums.length; i++){
            for(int j = Math.max(i - k, 0) + 1; j < Math.min(nums.length, i + k + 1); j++){
                if(i == j) continue;
                if(Math.abs(Long.valueOf(nums[i]) - Long.valueOf(nums[j])) <= Long.valueOf(t)) return true;
            }
        }
        return false;
    }
}
*/
// @lc code=end

