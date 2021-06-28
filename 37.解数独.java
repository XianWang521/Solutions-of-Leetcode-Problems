/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start
class Solution {
	public void solveSudoku(char[][] board) {
		boolean[][] row = new boolean[9][9];
		boolean[][] col = new boolean[9][9];
		boolean[][] block = new boolean[9][9];

		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(board[i][j] == '.') continue;
				int num = board[i][j] - '1';
				row[i][num] = col[j][num] = block[(i/3)*3 + j/3][num] = true;
			}
		}
		dfs(board, row, col, block, 0);
	}

	private boolean dfs(char[][] board, boolean[][] row, boolean[][] col, boolean[][] block, int n){
		if(n == board.length * board[0].length) return true;
		int ro = n / 9, co = n % 9;
		if(board[ro][co] != '.') return dfs(board, row, col, block, n+1);

		for(int i = 0; i < board.length; i++){
			if(row[ro][i] || col[co][i] || block[(ro/3)*3 + co/3][i]) continue;
			board[ro][co] = (char)(i + '1');
			row[ro][i] = col[co][i] = block[(ro/3)*3 + co/3][i] = true;
			if(dfs(board, row, col, block, n+1)) return true;
			row[ro][i] = col[co][i] = block[(ro/3)*3 + co/3][i] = false;
			board[ro][co] = '.';
		}
		return false;
	}
}
// @lc code=end

