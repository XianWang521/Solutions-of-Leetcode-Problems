/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = 0, total = 0, cur = 0;
        for(int i = 0; i < gas.length; i++){
            int temp = gas[i] - cost[i];
            total += temp;
            cur += temp;
            if(cur < 0){
                cur = 0;
                res = i + 1;
            }
        }
        if(total < 0) res = -1;
        return res;
    }
}
// @lc code=end

