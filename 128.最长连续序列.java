import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start
/* Hashset */
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) set.add(nums[i]);

        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i]-1)) continue;
            else{
                int temp = 0;
                while(set.contains(nums[i]++)) temp++;
                res = Math.max(temp, res);
            }
        }
        return res;
    }
}
/* Sort : Time complexity at least O(n * log n)
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int cur = 1, res = 0, temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == temp) continue;
            else if(nums[i] == temp + 1){
                cur++;
                temp = nums[i];
            }
            else{
                res = Math.max(cur, res);
                cur = 1;
                temp = nums[i];
            }
        }
        return Math.max(cur, res);
    }
}
*/
// @lc code=end

