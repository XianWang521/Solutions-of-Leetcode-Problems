/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        if(s == null) return 0;
        String ss = s.strip();
        if(ss.equals("")) return 0;

        int res = 1;
        for(int i = 1; i < ss.length(); i++){
            if(ss.charAt(i-1) == ' ' && ss.charAt(i) != ' ') res++;
        }
        return res;
    }
}
// @lc code=end

