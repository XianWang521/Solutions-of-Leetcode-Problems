/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode pre = head, cur = head.next;
        dummy.next = head;
        while(cur != null){
            if(pre.val <= cur.val){
                pre = cur;
                cur = cur.next;
            }
            else{
                ListNode temp = dummy;
                while(temp.next != cur && temp.next.val <= cur.val) temp = temp.next;
                pre.next = cur.next;
                cur.next = temp.next;
                temp.next = cur;
                cur = pre.next;
            }
        }
        return dummy.next;
    }
}
// @lc code=end

