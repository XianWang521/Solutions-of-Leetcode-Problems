/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        dfs(root, res, "");
        return res;
    }
    private void dfs(TreeNode root, List<String> res, String temp){
        if(root == null) return;
        temp += root.val;
        if(root.left == null && root.right == null){
            res.add(temp);
            return;
        }
        dfs(root.left, res, temp + "->");
        dfs(root.right, res, temp + "->");
    }
}
// @lc code=end

