/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int len = Math.max(a.length(), b.length());
        int temp = 0;
        for(int i = 0; i < len; i++){
            int a1 = i < a.length()? a.charAt(a.length() - 1 - i) - '0': 0;
            int b1 = i < b.length()? b.charAt(b.length() - 1 - i) - '0': 0;
            temp += a1 + b1;
            s.insert(0, String.valueOf(temp%2));
            temp /= 2;
        }
        if(temp == 1) s.insert(0, String.valueOf(1));
        return s.toString();
    }
}
// @lc code=end

