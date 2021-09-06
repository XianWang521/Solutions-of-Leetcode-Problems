import java.util.Stack;

/*
 * @lc app=leetcode.cn id=224 lang=java
 *
 * [224] 基本计算器
 */

// @lc code=start
// Refer from official solution
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0, flag = 1;
        stack.push(flag);

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ') continue;
            else if(c == '+') flag = stack.peek();
            else if(c == '-') flag = -stack.peek();
            else if(c == '(') stack.push(flag);
            else if(c == ')') stack.pop();
            else{
                long temp = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    temp = temp * 10 + s.charAt(i) - '0';
                    i++;
                }
                res += temp * flag;
                i--;
            }
        }
        return res;
    }
}
// @lc code=end

