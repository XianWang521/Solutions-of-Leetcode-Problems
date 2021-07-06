import java.util.LinkedList;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(queue.size() > 0){
            int num = queue.size();
            for(int i = 0; i < num; i++){
                Node s = queue.remove();
                if(i < num-1) s.next = queue.getFirst();
                else s.next = null;

                if(s.left != null) queue.add(s.left);
                if(s.right != null) queue.add(s.right);
            }
        }
        return root;
    }
}
// @lc code=end

