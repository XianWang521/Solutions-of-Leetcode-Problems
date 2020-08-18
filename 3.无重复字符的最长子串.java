import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length(),max_len=0,i=0,j=0;
        Set<Character> character = new HashSet<>();

        while(i<len)
        {
            if(!character.contains(s.charAt(i)))
            {
                //dont't find duplicate letter, put the letter in the set
                character.add(s.charAt(i++));
                max_len=Math.max(max_len,(int)character.size());
            }
            //find duplicate letter, 
            //erase the letter before the duplicate letter in the set.
            //left pointer i doesn't increase, 
            //right pointer j increase repeatedlly.
            else character.remove(s.charAt(j++));
        }
        return max_len;
    }
}
// @lc code=end

