import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(root, targetSum, 0, temp, res);
        return res;
    }

    private void dfs(TreeNode root, int targetSum, int num, List<Integer> temp, List<List<Integer>> res){
        if(root == null) return;
        num += root.val;
        temp.add(root.val);
        if(num == targetSum && root.left == null && root.right == null) res.add(new ArrayList(temp));
        dfs(root.left, targetSum, num, temp, res);
        dfs(root.right, targetSum, num, temp, res);
        temp.remove(temp.size()-1);
    }
}
// @lc code=end

