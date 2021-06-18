import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=95 lang=java
 *
 * [95] 不同的二叉搜索树 II
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
    public List<TreeNode> generateTrees(int n) {
        return generate(1, n);
    }
    public List<TreeNode> generate(int start, int end){
        List<TreeNode> res = new LinkedList<>();
        if(start > end){
            res.add(null);
            return res;
        }

        for(int i = start; i <= end; i++){
            List<TreeNode> l = generate(start, i-1);
            List<TreeNode> r = generate(i+1, end);
            for(TreeNode left : l)
                for(TreeNode right : r)
                    res.add(new TreeNode(i, left, right));
        }
        return res;
    }
}
// @lc code=end

