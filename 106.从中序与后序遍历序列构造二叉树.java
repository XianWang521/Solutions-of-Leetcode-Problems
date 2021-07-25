import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
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
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        for(int i = 0; i < n; i++)
            map.put(inorder[i], i);
        TreeNode res = solve(postorder, 0, n-1, 0, n-1);
        return res;
    }
    private TreeNode solve(int[] postorder, int in_left, int in_right, int post_left, int post_right){
        if(post_left > post_right) return null;
        // The final node in the postorder traversal is the root node
        int post_root = post_right;
        // Locate the root node in the inorder traversal
        int in_root = map.get(postorder[post_root]);

        TreeNode root = new TreeNode(postorder[post_root]);
        // Get the number of nodes in the left subtree
        int size = in_root - in_left;
        root.left = solve(postorder, in_left, in_root-1, post_left, post_left+size-1);
        root.right = solve(postorder, in_root+1, in_right, post_left+size, post_right-1);
        return root;
    }
}
// @lc code=end

