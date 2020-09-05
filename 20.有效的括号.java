import java.util.Map;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        else if(s.length()%2!=0) return false;

        Stack<Character> temp = new Stack<Character>();
        for(char a:s.toCharArray()){
            switch(a){
                case '(':temp.push(')'); break;
                case '[':temp.push(']'); break;
                case '{':temp.push('}'); break;
                default:{
                    if(!temp.empty() && a==temp.pop()) break;
                    else return false;
                }
            }
        }
        if(temp.empty()) return true;
        else return false;
    }
}
// @lc code=end

