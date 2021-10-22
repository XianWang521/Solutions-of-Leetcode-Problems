/*
 * @lc app=leetcode.cn id=304 lang=java
 *
 * [304] 二维区域和检索 - 矩阵不可变
 */

// @lc code=start
class NumMatrix {
    private int[][] nums;
    public NumMatrix(int[][] matrix) {
        nums = new int[matrix.length+1][matrix[0].length+1];
        for(int i = 1; i <= matrix.length; i++){
            for(int j = 1; j <= matrix[0].length; j++){
                if(j == 1) nums[i][j] = matrix[i-1][j-1];
                else nums[i][j] = nums[i][j - 1] + matrix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        if(row1 < 0 || col1 < 0 || row1 >= nums.length || col1 >= nums[0].length
        || row2 < 0 || col2 < 0 || row2 >= nums.length || col2 >= nums[0].length) return res;
        for(int i = row1; i <= row2; i++)
            res += nums[i+1][col2+1] - nums[i+1][col1];
        
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end

