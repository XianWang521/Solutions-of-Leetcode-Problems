/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
    	ArrayList<int[]> res = new ArrayList<>();
    	Arrays.sort(intervals, (a,b) -> {return a[0] - b[0];});
    	int left = intervals[0][0], right = intervals[0][1];
    	
    	for(int i = 1; i < intervals.length; i++) {
    		int left_temp = intervals[i][0], right_temp = intervals[i][1];
    		if(left_temp <= right) right = Math.max(right, right_temp);
    		else {
    			res.add(new int[] {left, right});
    			left = intervals[i][0];
    			right = intervals[i][1];
    		}
    	}
        res.add(new int[] {left, right});
    	return res.toArray(new int[res.size()][]);
    }
}
// @lc code=end

