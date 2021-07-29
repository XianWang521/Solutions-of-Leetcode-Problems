/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// I can't see you at the end of the way, 
// so I walked the way you came again.
// When I met you,
// I found out that you also walked the way I came.
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode p = headA, q = headB;
        while(p != q){
            p = (p == null? headB: p.next);
            q = (q == null? headA: q.next);
        }
        return p;
    }
}
// @lc code=end

