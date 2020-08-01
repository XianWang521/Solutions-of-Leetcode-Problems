/*
 * @lc app=leetcode.cn id=6 lang=cpp
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
public:
    string convert(string s, int numRows) {
        if (numRows == 1)
            return s;
        string result = "";
        int i, j, n = s.length(), cycle = 2 * numRows - 2;

        for (i = 0; i < numRows; i++)
        {
            for (j = 0; j + i < n; j += cycle)
            {
                result.append(s, j + i, 1);
                if (i != 0 && i != numRows - 1 && j + cycle - i < n)
                    result.append(s, j + cycle - i, 1);
            }
        }
        return result;
    }
};
// @lc code=end

