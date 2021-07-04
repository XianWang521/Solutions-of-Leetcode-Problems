/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return res;
        else queue.add(root);

        boolean left = true;
        while(queue.size() > 0){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int num = queue.size();
            for(int i = 0; i < num; i++){
                TreeNode s = queue.remove();
                if(left) temp.add(s.val);
                else temp.add(0, s.val);

                if(s.left != null) queue.add(s.left);
                if(s.right != null) queue.add(s.right);
            }
            res.add(temp);
            left = !left;
        }
        return res;
    }
}
// @lc code=end

