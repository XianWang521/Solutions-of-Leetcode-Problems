/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        dfs(res, n, n, new StringBuilder(""));
        return res;
    }
    private void dfs(List<String> res, int left, int right, StringBuilder temp){
        if(left==0 && right==0){
            res.add(temp.toString());
            return;
        }
        if(left<0 || right<left) return;
        if(left>0){
            dfs(res, left-1, right, temp.append("("));
            temp.deleteCharAt(temp.length()-1);
        }
        if(right>0){
            dfs(res, left, right-1, temp.append(")"));
            temp.deleteCharAt(temp.length()-1);
        } 
    }
}
// @lc code=end

