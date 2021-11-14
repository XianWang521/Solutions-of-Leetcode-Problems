/*
 * @lc app=leetcode.cn id=378 lang=java
 *
 * [378] 有序矩阵中第 K 小的元素
 */

// @lc code=start
// Refer from official solution: Binary search
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int len = matrix.length;
        int l = matrix[0][0], r = matrix[len-1][len-1];
        while(l < r){
            int mid = l + (r - l) / 2;
            if(check(matrix, mid, k, len)) r = mid;
            else l = mid + 1; 
        }
        return l;
    }
    
    public boolean check(int[][] matrix, int mid, int k, int len){
        int i = len - 1, j = 0, count = 0;
        while(i >= 0 && j < len){
            if(matrix[i][j] <= mid){
                count += i+1;
                j++;
            }
            else i--;
        }
        return count >= k;
    }
}

/*
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] temp = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int[] row: matrix)
            for (int i: row)
                temp[count++] = i;
            
        Arrays.sort(temp);
        return temp[k - 1];
    }
}
*/
// @lc code=end

