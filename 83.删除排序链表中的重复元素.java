/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode a = head;
        ListNode b = head.next;
        while(b != null){
            if(a.val != b.val){
                a = b;
                b = b.next;
            }
            else{
                a.next = b.next;
                b = b.next;
            }
        }
        return head;
    }
}
// @lc code=end

