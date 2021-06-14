/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int k = 0; k <= nums.length; k++)
            dfs(res, k, temp, 0, nums);
        return res;
    }

    public void dfs(List<List<Integer>> res, int k, ArrayList<Integer> temp, int index, int[] nums){
        if(k == 0) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(int i = index; i < nums.length; i++){
            if(temp.size() + nums.length - index < k) return;
            if(!temp.contains(nums[i]) || temp.size() == 0) temp.add(nums[i]);
            dfs(res, k-1, temp, i+1, nums);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

