import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        dfs(res, target, temp, candidates);
        return res;
    }

    public void dfs(List<List<Integer>> res, int target, ArrayList<Integer> temp, int[] candidates){
        if(target == 0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = 0; i < candidates.length; i++){
            if(target < candidates[i]) break;
            if(temp.size() > 0 && temp.get(temp.size()-1) > candidates[i]) continue;
            temp.add(candidates[i]);
            dfs(res, target-candidates[i], temp, candidates);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

