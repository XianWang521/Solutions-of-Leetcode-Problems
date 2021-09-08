import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=227 lang=java
 *
 * [227] 基本计算器 II
 */

// @lc code=start
class Solution {
    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<Integer>();
        int temp = 0;
        char flag = '+';
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))) temp = temp * 10 + s.charAt(i) - '0';
            if((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || i == s.length()-1){
                switch(flag){
                    case '+':stack.push(temp); break;
                    case '-':stack.push(-temp); break;
                    case '*':stack.push(stack.pop() * temp); break;
                    case '/':stack.push(stack.pop() / temp); break;
                }
                flag = s.charAt(i);
                temp = 0;
            }
        }

        int res = 0;
        while(!stack.isEmpty())
            res += stack.pop();
        return res;
    }
}
// @lc code=end

