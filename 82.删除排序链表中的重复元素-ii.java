/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
        ListNode res = new ListNode(0, head);
        ListNode p = res;
        while(p.next != null && p.next.next != null){
            if(p.next.val == p.next.next.val){
                int temp = p.next.val;
                while(p.next != null && p.next.val == temp)
                    p.next = p.next.next;
            }
            else p = p.next;
        }
        return res.next;
    }
}
// @lc code=end

