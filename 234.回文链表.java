import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> temp = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            temp.add(cur.val);
            cur = cur.next;
        }
        
        int l = 0, r = temp.size() - 1;
        while(l < r){
            if(temp.get(l).equals(temp.get(r))){
                l++;
                r--;
            }
            else return false;
        }
        return true;
    }
}
// @lc code=end

