/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
// Follow official solution 
class Solution {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for(int i = 0; i < n; i++)
            map.put(inorder[i], i);
        TreeNode res = solve(preorder, 0, n-1, 0, n-1);
        return res;
    }
    private TreeNode solve(int[] preorder, int pre_left, int pre_right, int in_left, int in_right){
        if(pre_left > pre_right) return null;
        // The first node in the preorder traversal is the root node
        int pre_root = pre_left;
        // Locate the root node in the inorder traversal
        int in_root = map.get(preorder[pre_root]);

        TreeNode root = new TreeNode(preorder[pre_root]);
        // Get the number of nodes in the left subtree
        int size = in_root - in_left;
        root.left = solve(preorder, pre_left+1, pre_left+size, in_left, in_root-1);
        root.right = solve(preorder, pre_left+1+size, pre_right, in_root+1, in_right);
        return root;
    }
}
// @lc code=end

