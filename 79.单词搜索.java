/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] visit = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++)
                if(board[i][j] == word.charAt(0))
                    if(dfs(board, word, visit, i, j, 0)) return true;
        return false;
    }

    public boolean dfs(char[][] board, String word, int[][] visit, int i, int j, int k){
        boolean res = false;
        if(k == word.length()) return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
        if(word.charAt(k) != board[i][j] || visit[i][j] == 1) return false;
        else{
            visit[i][j] = 1;
            res = dfs(board, word, visit, i+1, j, k+1) || dfs(board, word, visit, i-1, j, k+1)
            || dfs(board, word, visit, i, j+1, k+1) || dfs(board, word, visit, i, j-1, k+1); 
            visit[i][j] = 0;
        }
        return res;
    }
}
// @lc code=end

