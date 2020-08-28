/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder result = new StringBuilder("");
        Integer i, j, n = s.length(), cycle = 2 * numRows - 2;

        for (i = 0; i < numRows; i++)
        {
            for (j = 0; j + i < n; j += cycle)
            {
                result.append(s.charAt(j+i));
                if (i != 0 && i != numRows - 1 && j + cycle - i < n)
                    result.append(s.charAt(j+cycle-i));
            }
        }
        return result.toString();

    }
}
// @lc code=end

