import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层序遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return res;
        else queue.add(root);
        while(queue.size() > 0){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int num = queue.size();
            for(int i = 0; i < num; i++){
                TreeNode s = queue.remove();
                temp.add(s.val);

                if(s.left != null) queue.add(s.left);
                if(s.right != null) queue.add(s.right);
            }
            res.add(0, temp);
        }
        return res;
    }
}
// @lc code=end

