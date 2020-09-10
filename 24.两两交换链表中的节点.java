/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode point = dummy;
        point.next = head;
        while(point.next!=null&&point.next.next!=null)
        {
            ListNode temp =  point.next;
            point.next = temp.next;
            temp.next = point.next.next;
            point.next.next = temp;
            point = point.next.next;
        }
        return dummy.next;
    }
}
// @lc code=end

