/*
 * @lc app=leetcode.cn id=17 lang=cpp
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
public:
    vector<string> letterCombinations(string digits) {
        if(digits.length() == 0) return res;
        return dfs(digits, "", 0);
    }
    vector<string> res;
    map<char,string> key= {
        {'2', "abc"}, 
        {'3', "def"},
        {'4', "ghi"},
        {'5', "jkl"},
        {'6', "mno"},
        {'7', "pqrs"},
        {'8', "tuv"},
        {'9', "wxyz"},
    };
    vector<string> dfs(string digits, string temp, int len){
        if(len == digits.size()) res.push_back(temp);
        else{
            for(int i=0;i<key[digits[len]].length();i++)
            {
                temp += key[digits[len]][i];
                dfs(digits, temp, len+1);
                temp.pop_back();
            }
        }
        return res;
    }
};
// @lc code=end

