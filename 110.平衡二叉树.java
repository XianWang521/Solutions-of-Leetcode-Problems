/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
        if(height(root) < 0) return false;
        return true;
    }

    private int height(TreeNode root){
        if(root == null) return 0;
        int left, right;
        left = height(root.left);
        right = height(root.right);
        if(left == -1 || right == -1 || Math.abs(right - left) > 1) return -1;
        return Math.max(right, left) + 1;
    }
}
// @lc code=end

