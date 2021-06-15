/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
    public ListNode partition(ListNode head, int x) {
		ListNode small = new ListNode(0, null);
		ListNode stemp = small;
		ListNode large = new ListNode(0, null);
		ListNode ltemp = large;
		if(head == null) return head;
		while(head != null){
			if(head.val < x){
				stemp.next = head;
				stemp = stemp.next;
			}
			else{
				ltemp.next = head;
				ltemp = ltemp.next;
			}
			head = head.next;
		}
		stemp.next = large.next;
		ltemp.next = null;
		return small.next;
	}
}
// @lc code=end

