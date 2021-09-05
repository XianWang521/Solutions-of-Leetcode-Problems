import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
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
    public int countNodes(TreeNode root){
        if(root == null) return 0;
        int left = countHeight(root.left), right = countHeight(root.right);
        
        if(left == right) return countNodes(root.right) + (1<<left);
        else return countNodes(root.left) + (1<<right);
    }

    private int countHeight(TreeNode root){
        if(root == null) return 0;
        return countHeight(root.left) + 1;
    }
}
/*
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
*/
// @lc code=end

