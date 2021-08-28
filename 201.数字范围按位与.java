/*
 * @lc app=leetcode.cn id=201 lang=java
 *
 * [201] 数字范围按位与
 */

// @lc code=start
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int temp = 0;
        while(left < right){
            left >>= 1;
            right >>= 1;
            temp++;
        }
        return left<<temp;
    }
}
// @lc code=end

