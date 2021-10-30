import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=331 lang=java
 *
 * [331] 验证二叉树的前序序列化
 */

// @lc code=start
class Solution {
    public boolean isValidSerialization(String preorder) {
        LinkedList<String> stack = new LinkedList<>();
        String[] temp = preorder.split(",");

        for(int i = 0; i < temp.length; i++){
            stack.push(temp[i]);
            while(stack.size() > 2 && stack.get(0).equals("#") && stack.get(1).equals("#") && !stack.get(2).equals("#")){
                stack.pop();
                stack.pop();
                stack.pop();
                stack.push("#");
            }
        }
        return stack.size() == 1 && stack.pop().equals("#");
    }
}
// @lc code=end

