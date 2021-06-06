/*
 * @lc app=leetcode.cn id=57 lang=java
 *
 * [57] 插入区间
 */

// @lc code=start
class Solution {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		ArrayList<int[]> res = new ArrayList<>();
		if(intervals.length == 0) {
			res.add(newInterval);
			return res.toArray(new int[res.size()][]);
		}
		int temp1 = newInterval[0], temp2 = newInterval[1];
		int count = 0;
		for(int i = 0; i < intervals.length; i++) {
			int left = intervals[i][0], right = intervals[i][1];
			if(right < newInterval[0]) res.add(intervals[i]);
			else if(left <= temp2) {
				temp1 = Math.min(left, temp1);
				temp2 = Math.max(right, temp2);
			}
			else if(left > temp2) {
				if(count == 0) {
					res.add(new int[] {temp1, temp2});
					count = 1;
				}
				res.add(intervals[i]);
			}
		}
		if(count == 0)
			res.add(new int[] {temp1, temp2});
		return res.toArray(new int[res.size()][]);
	}
}
// @lc code=end

