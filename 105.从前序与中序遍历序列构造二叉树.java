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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++)
            map.put(inorder[i], i);
        TreeNode res = solve(map, preorder, inorder, 0, n-1, 0, n-1);
        return res;
    }
    private TreeNode solve(Map<Integer, Integer> map, int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right){
        if(pre_left > pre_right) return null;
        int pre_temp = pre_left;
        int in_temp = map.get(preorder[pre_temp]);
        TreeNode root = new TreeNode(preorder[pre_temp]);
        int size = in_temp - in_left;
        root.left = solve(map, preorder, inorder, pre_left+1, pre_left+size, in_left, in_temp-1);
        root.right = solve(map, preorder, inorder, pre_left+1+size, pre_right, in_temp+1, in_right);
        return root;
    }
}
// @lc code=end

