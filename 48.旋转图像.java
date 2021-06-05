/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
    	int[][] res = new int[matrix.length][matrix[0].length];
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix[0].length; j++) {
    			res[j][matrix[0].length-i-1] = matrix[i][j];
    		}
    	}
        for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix[0].length; j++) {
    			matrix[i][j] = res[i][j];
    		}
    	}
    }
}
// @lc code=end

