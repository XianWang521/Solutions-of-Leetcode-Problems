import java.util.Deque;

/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<Integer>();
        for(int i = 0; i < tokens.length; i++){
            String temp = tokens[i];
            if(temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(temp.equals("+")) stack.push(num2 + num1);
                else if(temp.equals("-")) stack.push(num2 - num1);
                else if(temp.equals("*")) stack.push(num2 * num1);
                else stack.push(num2 / num1);
            }
            else stack.push(Integer.parseInt(temp));
        }
        return stack.pop();
    }
}
// @lc code=end

