import java.util.Collections;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        LinkedList<Integer> stackmul = new LinkedList<>();
        LinkedList<String> stackstr = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        int mul = 0;
        char[] ch = s.toCharArray();

        for(char i: ch){
            if(i == '['){
                stackmul.push(mul);
                mul = 0;
                stackstr.push(res.toString());
                res = new StringBuilder();
            }
            else if(i == ']'){
                StringBuilder temp = new StringBuilder();
                int cur = stackmul.pop();
                for(int count = 0; count < cur; count++) temp.append(res);
                res = new StringBuilder(stackstr.pop() + temp);
            }
            else if(i >= '0' && i <= '9') mul = mul * 10 + i - '0';
            else res.append(i);
        }   
        return res.toString();
    }
}
// @lc code=end

