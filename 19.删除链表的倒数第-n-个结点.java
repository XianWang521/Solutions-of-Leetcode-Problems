/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode firstPoint = temp;
        ListNode secondPoint = temp;
        for(int i=0;i<n;i++){
            secondPoint = secondPoint.next;
        }
        while(secondPoint.next != null){
            secondPoint = secondPoint.next;
            firstPoint = firstPoint.next;
        }
        firstPoint.next = firstPoint.next.next;
        return temp.next;
    }
}
// @lc code=end

