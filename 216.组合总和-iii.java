import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        dfs(res, n, temp, k, 1);
        return res;
    }

    private void dfs(List<List<Integer>> res, int n, ArrayList<Integer> temp, int k, int start){
        if(n == 0 && k == temp.size()){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = start; i < 10; i++){
            if(n - i < 0) return;
            temp.add(i);
            dfs(res, n-i, temp, k, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

