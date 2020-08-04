/*
 * @lc app=leetcode.cn id=12 lang=cpp
 *
 * [12] 整数转罗马数字
 */

// @lc code=start
class Solution {
public:
    string intToRoman(int num) {
        string roman="";
        string re[4][10]={
            {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"0", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"0", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"0", "M", "MM", "MMM"}};
        int i=0,k=1000;
        for(i=3;i>=0;i--)
        {
            if(num/k!=0) roman+=re[i][num/k];
            num%=k;
            k/=10;
        }
        return roman;
    }
};
// @lc code=end

