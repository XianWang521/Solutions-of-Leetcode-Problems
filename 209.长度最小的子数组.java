import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
// Binary search refer from offical solution
class Solution {
    public int minSubArrayLen(int target, int[] nums){
        int minlen = Integer.MAX_VALUE;
        int[] sums = new int[nums.length+1];
        for(int i = 1; i <= nums.length; i++) sums[i] = sums[i-1] + nums[i-1];
        for(int i = 0; i <= nums.length; i++){
            int score = target + sums[i];
            int index = Arrays.binarySearch(sums, score);
            if(index < 0) index = ~index;
            if(index <= nums.length) minlen = Math.min(minlen, index - i);
        }
        return minlen == Integer.MAX_VALUE? 0: minlen;
    }
}
// sliding windows
/*
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        Queue<Integer> q = new LinkedList<Integer>();
        int sum = 0, minlen = Integer.MAX_VALUE, right = 0;
        while(right < nums.length){
            sum += nums[right];
            q.add(nums[right++]);
            while(sum >= target){
                if(minlen > q.size()) minlen = q.size();
                sum -= q.poll();
            }
        }
        if(minlen == Integer.MAX_VALUE) return 0;
        else return minlen;
    }
}
*/
// @lc code=end

