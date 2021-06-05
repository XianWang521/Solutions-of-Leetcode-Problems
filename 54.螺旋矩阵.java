/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		int row = matrix.length, col = matrix[0].length;
		int[][] visit = new int[row][col];
		int total = row * col, path = 1, m = 0, n = 0;
		/* path: right = 1, down = 2, left = 3, up = 4*/
		List<Integer> res = new ArrayList<Integer>();
		
		while(total > 0) {
			if(path == 1) {
				for(int j = n; j < col; j++) {
					if(visit[m][j] == 0) {
						res.add(matrix[m][j]);
						visit[m][j] = 1;
						total--;
						n = j;
					}
				}
				path = 2;
				
			}
			else if(path == 2) {
				for(int i = m; i < row; i++) {
					if(visit[i][n] == 0) {
						res.add(matrix[i][n]);
						visit[i][n] = 1;
						total--;
						m = i;
					}
				}
				path = 3;
			}
			else if(path == 3) {
				for(int j = n; j >= 0; j--) {
					if(visit[m][j] == 0) {
						res.add(matrix[m][j]);
						visit[m][j] = 1;
						total--;
						n = j;
					}
				}
				path = 4;
			}
			else{
				for(int i = m; i >= 0; i--) {
					if(visit[i][n] == 0) {
						res.add(matrix[i][n]);
						visit[i][n] = 1;
						total--;
						m = i;
					}
				}
				path = 1;
			}
		}	
		return res;
    }
}
// @lc code=end

