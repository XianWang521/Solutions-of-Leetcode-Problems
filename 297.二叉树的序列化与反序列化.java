import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=297 lang=java
 *
 * [297] 二叉树的序列化与反序列化
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder res = new StringBuilder();
        res.append("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp != null){
                res.append(temp.val + "");
                queue.add(temp.left);
                queue.add(temp.right);
            }
            else res.append("null");
            res.append(",");
        }
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() <= 2) return null;
        String[] info = data.substring(1, data.length()-1).split(",");
        if(info.length == 0) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(info[0]));
        queue.add(root);

        for(int i = 1; i < info.length; ){
            TreeNode temp = queue.poll();
            if(!info[i].equals("null")){
                temp.left = new TreeNode(Integer.valueOf(info[i]));
                queue.add(temp.left);
            }
            i++;
            if(i < info.length && !info[i].equals("null")){
                temp.right = new TreeNode(Integer.valueOf(info[i]));
                queue.add(temp.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end

