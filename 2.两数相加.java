/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node=new ListNode(0);
        ListNode p=l1,q=l2,root=node;
        int result=0,carry=0;
        while(p!=null||q!=null)
        {
            int x=(p==null)?0:p.val;
            int y=(q==null)?0:q.val;
            result=x+y+carry;
            carry=result/10;

            node.next=new ListNode(result%10);
            node=node.next;
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;
            result=0;
        }
        if(carry>0) node.next=new ListNode(carry);
        return root.next;
    }
}
// @lc code=end

