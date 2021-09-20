/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
// Refer from official solution
/*
1. An integer that can be divisible by 9, 
add up each digit can be divisible by 9.
2. For integers that cannot be divisible by 9,
add up each digit and modulo 9,
which is the same as the initial number modulo 9
Prove: https://www.zhihu.com/question/30972581/answer/50203344
*/
class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}

// My solution
/*
class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        char[] temp = String.valueOf(num).toCharArray();
        int res = 0;
        for(char i : temp) res += i - '0';
        return addDigits(res);
    }
}
*/
// @lc code=end

