import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根节点到叶节点数字之和
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
    public int sumNumbers(TreeNode root) {
        List<Integer> nums = new ArrayList<Integer>();
        int temp = 0, res = 0;
        dfs(root, nums, temp);
        for(int i = 0; i < nums.size(); i++)
            res += nums.get(i);
        return res;
    }
    private void dfs(TreeNode root, List<Integer> nums, int temp){
        if(root == null) return;
        temp = temp * 10 + root.val;
        if(root.left == null && root.right == null){
            nums.add(temp);
        }else{
            dfs(root.left, nums, temp);
            dfs(root.right, nums, temp);
            temp /= 10;
        }
    }
}
// @lc code=end

