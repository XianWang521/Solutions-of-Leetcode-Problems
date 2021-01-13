import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer> [] rows = new HashMap[9];
        HashMap<Integer, Integer> [] cols = new HashMap[9];
        HashMap<Integer, Integer> [] boxes = new HashMap[9];
        for(int i = 0; i < 9; i++){
            rows[i] = new HashMap<Integer, Integer>();
            cols[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int n = board[i][j] - '0';   
                    rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                    cols[j].put(n, cols[j].getOrDefault(n, 0) + 1);
                    boxes[i/3*3+j/3].put(n, boxes[i/3*3+j/3].getOrDefault(n, 0) + 1);

                    if(rows[i].get(n) > 1 || cols[j].get(n) > 1 || boxes[i/3*3+j/3].get(n) > 1)  return false;
                }
            }
        }

        return true;
    }
}
// @lc code=end

