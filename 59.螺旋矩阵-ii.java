/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
    	int row = n, col = n;
		int[][] visit = new int[row][col];
		int[][] res = new int[row][col];
		int total = 1, path = 1, a = 0, b = 0;
		/* path: right = 1, down = 2, left = 3, up = 4*/
		
		while(total <= row * col) {
			if(path == 1) {
				for(int j = b; j < col; j++) {
					if(visit[a][j] == 0) {
						res[a][j] = total;
						visit[a][j] = 1;
						total++;
						b = j;
					}
				}
				path = 2;
				
			}
			else if(path == 2) {
				for(int i = a; i < row; i++) {
					if(visit[i][b] == 0) {
						res[i][b] = total;
						visit[i][b] = 1;
						total++;
						a = i;
					}
				}
				path = 3;
			}
			else if(path == 3) {
				for(int j = b; j >= 0; j--) {
					if(visit[a][j] == 0) {
						res[a][j] = total;
						visit[a][j] = 1;
						total++;
						b = j;
					}
				}
				path = 4;
			}
			else{
				for(int i = a; i >= 0; i--) {
					if(visit[i][b] == 0) {
						res[i][b] = total;
						visit[i][b] = 1;
						total++;
						a = i;
					}
				}
				path = 1;
			}
		}
		return res;
    }
}
// @lc code=end

