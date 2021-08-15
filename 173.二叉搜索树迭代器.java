import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=173 lang=java
 *
 * [173] 二叉搜索树迭代器
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
class BSTIterator {
    private int idx;
    private List<Integer> temp;

    public BSTIterator(TreeNode root) {
        idx = 0;
        temp = new ArrayList<Integer>();
        inorder(root, temp);
    }

    private void inorder(TreeNode root, List<Integer> temp){
        if(root == null) return;
        inorder(root.left, temp);
        temp.add(root.val);
        inorder(root.right, temp);
    }
    
    public int next() {
        int res = temp.get(idx);
        idx++;
        return res;
    }
    
    public boolean hasNext() {
        return idx < temp.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

