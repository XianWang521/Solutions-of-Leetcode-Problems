/*
 * @lc app=leetcode.cn id=289 lang=java
 *
 * [289] 生命游戏
 */

// @lc code=start
// live to dead : board[i][j] = 2
// dead to live : board[i][j] = 3
class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;

        for(int i = 0; i < m ;i++){
            for(int j = 0; j < n; j++){
                int count = 0;
                for(int a = Math.max(0, i - 1); a <= Math.min(m - 1, i + 1); a++){
                    for(int b = Math.max(0, j - 1); b <= Math.min(n - 1, j + 1); b++){
                        if(a == i && b == j) continue;
                        // calculate the count of live cells in preivious state
                        if(board[a][b] == 1 || board[a][b] == 2) count++;
                    }
                }
                if(board[i][j] == 0 && count == 3) board[i][j] = 3;
                if(board[i][j] == 1 && (count < 2 || count > 3)) board[i][j] = 2;
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 2) board[i][j] = 0;
                else if(board[i][j] == 3) board[i][j] = 1;
            }
        }
    }
}
// @lc code=end

