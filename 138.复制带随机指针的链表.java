import java.util.HashMap;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode.cn id=138 lang=java
 *
 * [138] 复制带随机指针的链表
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
// Similar to the Question 133 Clone Graph
class Solution {
    private HashMap<Node, Node> visit = new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        if(!visit.containsKey(head)){
            Node clone = new Node(head.val);
            visit.put(head, clone);
            clone.next = copyRandomList(head.next);
            clone.random = copyRandomList(head.random);
        }
        return visit.get(head);
    }
}
// @lc code=end

