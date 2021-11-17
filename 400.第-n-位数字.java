/*
 * @lc app=leetcode.cn id=400 lang=java
 *
 * [400] 第 N 位数字
 */

// @lc code=start
class Solution {
    public int findNthDigit(int n) {
        int digits = 1;
        int count = 9;
        while((long)count * digits < n){
            n -= digits * count;
            count *= 10;
            digits++;
        }

        int num = count / 9 + (n-1) / digits;
        String nums = num + "";
        return (int)(nums.charAt((n-1) % digits) - '0');
    }
}
// @lc code=end

