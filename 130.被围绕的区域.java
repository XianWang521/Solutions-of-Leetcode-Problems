/*
 * @lc app=leetcode.cn id=130 lang=java
 *
 * [130] 被围绕的区域
 */

// @lc code=start
class Solution {
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++){
            dfs(board, i, 0);
            dfs(board, i, n-1);
        }
        for(int j = 0; j < n; j++){
            dfs(board, 0, j);
            dfs(board, m-1, j);
        }
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == '*') board[i][j] = 'O';
    }
    private void dfs(char[][] board, int i, int j){
        int m = board.length, n = board[0].length;
        if(i < 0 || i > m-1 || j < 0 || j > n-1 || board[i][j] != 'O') return;
        else{
            board[i][j] = '*';
            dfs(board, i-1, j);
            dfs(board, i+1, j);
            dfs(board, i, j-1);
            dfs(board, i, j+1);
        }
    }
}
// @lc code=end

