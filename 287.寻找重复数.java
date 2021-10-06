import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[nums[0]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }
}
/*
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                res = nums[i];
                break;
            }
        }
        return res;
    }
}
*/
// @lc code=end

