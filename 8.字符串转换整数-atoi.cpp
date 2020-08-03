/*
 * @lc app=leetcode.cn id=8 lang=cpp
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
public:
    int myAtoi(string str) {
        int result=0,len=str.size(),flag=1,index=0,temp;
        while(index<len && str[index]==' ') index++;
        if(index<len)
        {
            if(str[index]=='-') flag=-1;
            if(str[index]=='-'||str[index]=='+') index++;
        }
        while(index<len)
        {
            if(str[index]>'9'||str[index]<'0') break;
            temp=str[index]-'0';
            if(flag>0 && (result > INT_MAX/10 || (result==INT_MAX/10 && temp>7))) return INT_MAX;
            if(flag<0 && (result > INT_MIN/10*flag || (result==INT_MIN/10*flag && temp>7))) return INT_MIN;
            result=result*10+temp;
            index++;
        }
        return result*flag;
    }
};
// @lc code=end

