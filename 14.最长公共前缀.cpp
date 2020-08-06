/*
 * @lc app=leetcode.cn id=14 lang=cpp
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        sort(strs.begin(),strs.end());
        if(strs.size()==0) return "";
        string re="",a=strs[0],b=strs[strs.size()-1];
        int i=0;
        while(a[i]==b[i] && i<a.length() && i<b.length())
            re += a[i++];
        return re; 
    }
};
// @lc code=end

