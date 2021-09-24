/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0, row = matrix.length - 1;
        while(col <= matrix[0].length - 1 && row >= 0){
            if(target < matrix[row][col]) row--;
            else if(target > matrix[row][col]) col++;
            else return true;
        }
        return false;
    }
}
// @lc code=end

