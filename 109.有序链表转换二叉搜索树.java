/*
 * @lc app=leetcode.cn id=109 lang=java
 *
 * [109] 有序链表转换二叉搜索树
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        TreeNode res = build(head, null);
        return res;
    }
    private TreeNode build(ListNode left, ListNode right){
        if(left == right) return null;
        ListNode a = left, mid = left;
        while(a != right && a.next != right){
            a = a.next;
            a = a.next;
            mid = mid.next;
        }
        TreeNode root = new TreeNode(mid.val);
        root.left = build(left, mid);
        root.right = build(mid.next, right);
        return root;
    }
}
// @lc code=end

