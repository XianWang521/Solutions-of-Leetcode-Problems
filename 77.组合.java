import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int[] candidates = new int[n];
        for(int i = 0; i < n; i++)
            candidates[i] = i + 1;
        dfs(res, k, temp, candidates, 0);
        return res;
    }

    public void dfs(List<List<Integer>> res, int k, ArrayList<Integer> temp, int[] candidates, int index){
        if(k == 0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(!temp.contains(candidates[i]) || temp.size() == 0) temp.add(candidates[i]);
            else continue;
            dfs(res, k-1, temp, candidates, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

