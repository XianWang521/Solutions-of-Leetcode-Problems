/*
 * @lc app=leetcode.cn id=221 lang=java
 *
 * [221] 最大正方形
 */

// @lc code=start
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];

        int res = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == 0 || j == 0){
                    if(matrix[i][j] == '0') dp[i][j] = 0;
                    else dp[i][j] = 1;
                }
                else if(matrix[i][j] == '1')
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i-1][j-1]), dp[i][j-1])  + 1;
                res = Math.max(res, dp[i][j]);
            }
        }
        return res * res;
    }
}
// @lc code=end

