import java.util.Random;

/*
 * @lc app=leetcode.cn id=382 lang=java
 *
 * [382] 链表随机节点
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
    ListNode head;
    Random rand;

    public Solution(ListNode head) {
        this.head = head;
        this.rand = new Random();
    }
    
    public int getRandom() {
        int res = 0, count = 0;
        ListNode cur = head;

        while(cur != null){
            count++;
            int temp = rand.nextInt(count);
            if(temp == 0) res = cur.val;
            cur = cur.next;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
// @lc code=end

