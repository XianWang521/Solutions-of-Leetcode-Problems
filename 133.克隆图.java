import java.util.HashMap;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode.cn id=133 lang=java
 *
 * [133] 克隆图
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
//  Refer from offical solution
class Solution {
    private HashMap<Node, Node> visit = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        if(visit.containsKey(node)) return visit.get(node);
        Node clone = new Node(node.val, new ArrayList());
        visit.put(node, clone);
        for(Node n: node.neighbors)
            clone.neighbors.add(cloneGraph(n));
        return clone;
    }
}
// @lc code=end

