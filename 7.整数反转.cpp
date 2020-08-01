/*
 * @lc app=leetcode.cn id=7 lang=cpp
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
public:
    int reverse(int x) {
        long long res = 0;
        while (x)
        {
            res = res * 10 + x % 10;
            x /= 10;
            if (res > INT_MAX || res < INT_MIN)
                return 0;
        }
        return res;
    }
};
// @lc code=end

