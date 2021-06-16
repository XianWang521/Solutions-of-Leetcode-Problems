/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Arrays.sort(nums);
		dfs(res, temp, 0, nums);
		return res;
	}

	public void dfs(List<List<Integer>> res, ArrayList<Integer> temp, int index, int[] nums) {
		res.add(new ArrayList<Integer>(temp));

		for (int i = index; i < nums.length; i++) {
			if(i != index && nums[i] == nums[i-1]) continue;
			temp.add(nums[i]);
			dfs(res, temp, i + 1, nums);
			temp.remove(temp.size() - 1);
		}
	}
}
// @lc code=end

