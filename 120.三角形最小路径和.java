import java.util.Arrays;

import org.graalvm.compiler.core.common.alloc.Trace;

/*
 * @lc app=leetcode.cn id=120 lang=java
 *
 * [120] 三角形最小路径和
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        dp[0] = triangle.get(0).get(0);
        for(int i = 1; i < triangle.size(); i++){
            dp[i] = dp[i-1] + triangle.get(i).get(i);
            for(int j = i-1; j > 0; j--)
                dp[j] = Math.min(dp[j-1], dp[j]) + triangle.get(i).get(j);
            dp[0] += triangle.get(i).get(0);
        }
        Arrays.sort(dp);
        return dp[0];
    }
}
// @lc code=end

