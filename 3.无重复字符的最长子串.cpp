/*
 * @lc app=leetcode.cn id=3 lang=cpp
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int len=s.length(),max_len=0,i=0,j=0;
        set<char> character;

        while(i<len)
        {
            if(character.find(s[i])==character.end())
            {
                //dont't find duplicate letter, put the letter in the set
                character.insert(s[i++]);
                max_len=max(max_len,(int)character.size());
            }
            //find duplicate letter, 
            //erase the letter before the duplicate letter in the set.
            //left pointer i doesn't increase, 
            //right pointer j increase repeatedlly.
            else character.erase(s[j++]);
        }
        return max_len;
    }
};
// @lc code=end
