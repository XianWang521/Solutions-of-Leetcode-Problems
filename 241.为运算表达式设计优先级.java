import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=241 lang=java
 *
 * [241] 为运算表达式设计优先级
 */

// @lc code=start
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        int num = 0, index = 0;
        while(index < expression.length() && Character.isDigit(expression.charAt(index))){
            num = num * 10 + expression.charAt(index) - '0';
            index++;
        }

        if(index == expression.length()){
            res.add(num);
            return res;
        }

        for(int i = index; i < expression.length() - 1; i++){
            char temp = expression.charAt(i);
            if(!Character.isDigit(temp)){
                List<Integer> l = diffWaysToCompute(expression.substring(0, i));
                List<Integer> r = diffWaysToCompute(expression.substring(i+1));

                for(int j : l){
                    for(int k : r){
                        if(temp == '+') res.add(j+k);
                        else if(temp == '-') res.add(j-k);
                        else if(temp == '*') res.add(j*k);
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end

