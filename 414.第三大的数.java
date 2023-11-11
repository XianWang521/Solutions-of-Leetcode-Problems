/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        long[] res = new long[3];
        Arrays.fill(res, Long.MIN_VALUE);
        
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if(cur > res[0]){
                res[2] = res[1];
                res[1] = res[0];
                res[0] = cur;
            } else if(cur < res[0] && cur > res[1]) {
                res[2] = res[1];
                res[1] = cur;
            } else if(cur < res[1] && cur > res[2]) {
                res[2] = cur;
            }
        }
        return res[2] == Long.MIN_VALUE? (int)res[0]: (int)res[2];
    }
}
// @lc code=end

