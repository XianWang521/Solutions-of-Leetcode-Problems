/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int i=0,re=0,temp=0,me=0;
        for(i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            temp=0;
            switch (c)
            {
                case 'I':temp=1;break;
                case 'V':temp=5;break;
                case 'X':temp=10;break;
                case 'L':temp=50;break;
                case 'C':temp=100;break;
                case 'D':temp=500;break;
                case 'M':temp=1000;break;
                default:temp=0;break;
            }
            if(me<temp) re+=temp-2*me;
            else re+=temp;
            me=temp;
        }
        return re;
    }
}
// @lc code=end

