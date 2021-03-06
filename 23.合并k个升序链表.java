/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个升序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length, step = 2;
        if(len == 0) return null;
        while(step <= len){
            for(int i=0;i<len-step;i+=step){
                lists[i] = mergeTwoLists(lists[i], lists[i+step-1]);
                lists[i+step-1] = null;
            }
            step *= 2;
        }
        for(int i=1;i<len;i++){
            if(lists[i]!=null) lists[0] = mergeTwoLists(lists[0], lists[i]);
        }
        return lists[0];
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode re = temp;
        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1==null) temp.next=l2;
        else temp.next=l1;
        return re.next;
    }
}
// @lc code=end

