import java.util.List;

/*
 * @lc app=leetcode.cn id=140 lang=java
 *
 * [140] 单词拆分 II
 */

// @lc code=start
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        dfs(s, wordDict, res, temp, 0);
        return res;
    }
    private void dfs(String s, List<String> wordDict, List<String> res, List<String> temp, int start){
        if(start == s.length()){
            res.add(String.join(" ", temp));
            return;
        }
        for(int i = start+1; i <= s.length(); i++){
            String str = s.substring(start, i);
            if(!wordDict.contains(str)) continue;
            temp.add(str);
            dfs(s, wordDict, res, temp, i);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

