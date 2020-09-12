/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy, end = head, pre, cur;
        int count = 0;
        if(k == 1) return dummy.next;
        while(end!=null){
            count++;
            if(count%k==0){
                pre = start.next;
                cur = pre.next;
                ListNode temp;
                while(cur!=end){
                    temp = cur.next;
                    cur.next = pre;
                    pre = cur;
                    cur = temp;
                }
                temp = start.next;
                start.next.next = cur.next;
                start.next = cur;
                cur.next = pre;
                start = temp;
                end = start.next;
            }
            else{
                end = end.next;
            }
        }
        return dummy.next;
    }   
}
// @lc code=end

