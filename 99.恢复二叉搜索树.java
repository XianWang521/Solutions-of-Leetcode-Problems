/*
 * @lc app=leetcode.cn id=99 lang=java
 *
 * [99] 恢复二叉搜索树
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
    public void recoverTree(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        inorder(res, root);
        TreeNode x = null, y = null;
        for(int i = 0; i < res.size()-1; i++){
            if(res.get(i).val > res.get(i+1).val){
                if(x == null) x = res.get(i);
                y = res.get(i+1);
            }
        }
        if(x != null && y != null){
            int temp = x.val;
            x.val = y.val;
            y.val = temp;
        }
    }

    public void inorder(List<TreeNode> res, TreeNode root){
        if(root == null) return;
        inorder(res, root.left);
        res.add(root);
        inorder(res, root.right);
    }
}
// @lc code=end

