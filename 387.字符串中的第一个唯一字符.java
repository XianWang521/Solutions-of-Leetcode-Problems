/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < count.length; i++) count[i] = -1;
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(count[index] >= 0) count[index] = -2;
            else if(count[index] == -1) count[index] = i;
        }

        for(int i = 0; i < count.length; i++)
            if(count[i] >= 0) res = Math.min(res, count[i]);
        
        return res == Integer.MAX_VALUE?-1:res;
    }
}
// @lc code=end

