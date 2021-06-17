/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(0, head);
		ListNode pre = dummy;
		int count = 0;
		while(pre.next != null){
			if(count == left-1) break;
            count++;
			pre = pre.next;
		}
		ListNode cur = pre.next, next;
        count = 0;
		while (count < right - left) {
			next = cur.next;
			cur.next = next.next;
			next.next = pre.next;
			pre.next = next;
			count++;
		}
		return dummy.next;
	}
}
// @lc code=end
