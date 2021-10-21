/*
 * @lc app=leetcode.cn id=338 lang=java
 *
 * [338] 比特位计数
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i = 1; i <= n; i++){
            if((i & 1) == 1) res[i] = res[i-1] + 1;
            else res[i] = res[i/2];
        }
        return res;
    }
}
// @lc code=end

