/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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
    public void flatten(TreeNode root) {
        List<TreeNode> temp = new ArrayList<TreeNode>();
        preorder(temp, root);
        for(int i = 1; i < temp.size(); i++){
            TreeNode a = temp.get(i-1);
            TreeNode b = temp.get(i);
            a.left = null;
            a.right = b;
            b.left = b.right = null;
        }
    }
    private void preorder(List<TreeNode> temp, TreeNode root){
        if(root != null){
            temp.add(root);
            preorder(temp, root.left);
            preorder(temp, root.right);
        }
    }
}
// @lc code=end

