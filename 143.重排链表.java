import java.util.LinkedList;
/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
        if(head == null) return;
		List<ListNode> queue = new ArrayList<ListNode>();
		ListNode temp = head;
		while(temp != null){
			queue.add(temp);
			temp = temp.next;
		}
		head = queue.remove(0);
		temp = head;

		while(!queue.isEmpty()) {
			temp.next = queue.remove(queue.size() - 1);
			temp = temp.next;
            if(queue.isEmpty()) break;
			temp.next = queue.remove(0);
			temp = temp.next;
		}
		temp.next = null;
    }
}
// @lc code=end

