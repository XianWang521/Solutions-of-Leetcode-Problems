import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        key = new HashMap<>();
        key.put('2', "abc");
        key.put('3', "def");
        key.put('4', "ghi");
        key.put('5', "jkl");
        key.put('6', "mno");
        key.put('7', "pqrs");
        key.put('8', "tuv");
        key.put('9', "wxyz");
        if(digits.length() == 0) return res;
        return dfs(digits, new StringBuilder(""), 0);
    }
    List<String> res = new ArrayList<>();
    private Map<Character, String> key;

    List<String> dfs(String digits, StringBuilder temp, int len){
        if(len == digits.length()) res.add(temp.toString());
        else{
            for(int i=0;i<key.get(digits.charAt(len)).length();i++)
            {
                temp.append(key.get(digits.charAt(len)).charAt(i));
                dfs(digits, temp, len+1);
                temp.deleteCharAt(temp.length()-1);
            }
        }
        return res;
    }
}
// @lc code=end

