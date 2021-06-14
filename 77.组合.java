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
        dfs(res, k, temp, 0, n);
        return res;
    }

    public void dfs(List<List<Integer>> res, int k, ArrayList<Integer> temp, int index, int n){
        if(k == 0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(int i = index; i < n; i++){
            if(temp.size() + n - index < k) return;
            if(!temp.contains(i+1) || temp.size() == 0) temp.add(i+1);
            dfs(res, k-1, temp, i+1, n);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

