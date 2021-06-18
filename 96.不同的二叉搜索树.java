/*
 * @lc app=leetcode.cn id=96 lang=java
 *
 * [96] 不同的二叉搜索树
 */

// @lc code=start
class Solution {
    public int numTrees(int n) {
        // dp(n) represents the number of binary search trees when there has n nodes
        // dp(n)  = sum(f(i)); i = 1 .. n; f(i) represents the number of binary search trees when the root is i
        // f(i) = dp(i-1) * dp(n-i)
        int[] res = new int[n+1];
        res[0] = 1;
        res[1] = 1;
        for(int i = 2; i < res.length; i++)
            for(int j = 1; j <= i; j++)
                res[i] += res[j-1] * res[i-j];
        return res[n];
    }
}
// @lc code=end

