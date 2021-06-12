/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        int flag = 0;
        // flag = 0: no zero when matrix[0][col] and matrix[row][0]
        // flag = 1: exist matrix[row][0] = 0 when row > 0
        // flag = 2: exist matrix[0][col] = 0 when col > 0
        // flag = 3: matrix[0][0] = 0
        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                flag = 1;
                break;
            }
        }
        for(int i = 1; i < matrix[0].length; i++){
            if(matrix[0][i] == 0){
                if(flag == 1) flag = 3;
                else flag = 2;
                break;
            }
        }
        if(matrix[0][0] == 0) flag = 3;

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
        }
        if(flag == 1 || flag == 3)
            for(int i = 0; i < matrix.length; i++) matrix[i][0] = 0;
        if(flag == 2 || flag == 3)
            for(int i = 0; i < matrix[0].length; i++) matrix[0][i] = 0;
    }
}
// @lc code=end

