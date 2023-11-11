/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/* Tortoise and Rabbit: Fast and slow pointers */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while(true){
            if(fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        return true;
    }
}
// @lc code=end

