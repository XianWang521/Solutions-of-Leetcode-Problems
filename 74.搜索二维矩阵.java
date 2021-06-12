/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index = searchCol(matrix, target);
        if(index < 0) return false;
        Boolean res = searchRow(matrix[index], target);
        return res;
    }

    public int searchCol(int[][] matrix, int target){
        int low = -1, high = matrix.length - 1;
        while(low < high){
            int mid = (high - low + 1)/2 + low;
            if(matrix[mid][0] <= target) low = mid;
            else high = mid - 1;
        }
        return low;
    }
    
    public boolean searchRow(int[] row, int target){
        int low = 0, high = row.length - 1;
        while(low <= high){
            int mid = (high - low)/2 + low;
            if(row[mid] < target) low = mid + 1;
            else if(row[mid] > target) high = mid - 1;
            else return true;
        }
        return false;
    }
}
// @lc code=end

