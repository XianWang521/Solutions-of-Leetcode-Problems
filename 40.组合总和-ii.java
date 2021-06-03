/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        dfs(res, target, temp, candidates, 0);
        return res;
    }

    public void dfs(List<List<Integer>> res, int target, ArrayList<Integer> temp, int[] candidates, int index){
        if(target == 0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(target < candidates[i]) break;
            if(i > index && candidates[i] == candidates[i-1]) continue;

            temp.add(candidates[i]);
            dfs(res, target-candidates[i], temp, candidates, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end