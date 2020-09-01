/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
        int result=0,len=str.length(),flag=1,index=0,temp;
        while(index<len && str.charAt(index)==' ') index++;
        if(index<len)
        {
            if(str.charAt(index)=='-') flag=-1;
            if(str.charAt(index)=='-'||str.charAt(index)=='+') index++;
        }
        while(index<len)
        {
            if(str.charAt(index)>'9'||str.charAt(index)<'0') break;
            temp=str.charAt(index)-'0';
            if(flag>0 && (result > Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && temp>7))) return Integer.MAX_VALUE;
            if(flag<0 && (result > Integer.MIN_VALUE/10*flag || (result==Integer.MIN_VALUE/10*flag && temp>7))) return Integer.MIN_VALUE;
            result=result*10+temp;
            index++;
        }
        return result*flag;
    }
}
// @lc code=end

