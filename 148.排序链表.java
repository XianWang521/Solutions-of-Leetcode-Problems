/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode l = sortList(head),r = sortList(temp), dummy = new ListNode();
        temp = dummy;
        while(l != null && r != null){
            if(l.val < r.val){
                temp.next = l;
                l = l.next;
            }
            else{
                temp.next = r;
                r = r.next;
            }
            temp = temp.next;
            if(l != null) temp.next = l;
            else if(r != null) temp.next = r;
        }
        return dummy.next;
    }
}
// @lc code=end

