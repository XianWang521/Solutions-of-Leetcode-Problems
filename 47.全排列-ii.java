/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	List<Integer> temp = new ArrayList<Integer>();
    	Arrays.sort(nums);
    	int[] visit = new int[nums.length];
    	dfs(res, temp, nums, visit);
    	return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int[] visit) {
    	if(temp.size() == nums.length){
    		res.add(new ArrayList<Integer>(temp));
    		return;
    	}
    	for(int i = 0; i < nums.length; i++) {
    		if(visit[i] == 1 || (i > 0 && nums[i] == nums[i-1] && visit[i-1] == 0)) continue;
    		temp.add(nums[i]);
    		visit[i] = 1;
    		dfs(res, temp, nums, visit);
    		visit[i] = 0;
    		temp.remove(temp.size()-1);
    	}
    }
}
// @lc code=end

