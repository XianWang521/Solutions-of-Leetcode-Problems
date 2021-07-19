/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
// Reference from offical answer
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> temp = new ArrayList<String>();
        if(s.length() == 0) return res;
        char[] ss = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int j = 0; j < s.length(); j++){
            for(int i = j; i >= 0; i--){
                if(i == j) dp[i][j] = true;
                else if(j - i == 1) dp[i][j] = (ss[i] == ss[j]);
                else dp[i][j] = (ss[i] == ss[j]) && dp[i+1][j-1];
            }
        }
        dfs(s, res, temp, dp, 0);
        return res;
    }
    private void dfs(String s, List<List<String>> res, List<String> temp, boolean[][] dp, int start){
        if(start == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < s.length(); i++){
            if(dp[start][i]){
                temp.add(s.substring(start, i+1));
                dfs(s, res, temp, dp, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
// @lc code=end

