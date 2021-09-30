import java.util.Map;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] p = pattern.toCharArray();
        Map<Character, String> ch2str = new HashMap<>();
        Map<String, Character> str2ch = new HashMap<>();

        if(words.length != p.length) return false;
        for(int i = 0; i < words.length; i++){
            if(ch2str.containsKey(p[i]) && !ch2str.get(p[i]).equals(words[i])) return false;
            if(str2ch.containsKey(words[i]) && !str2ch.get(words[i]).equals(p[i])) return false;
            str2ch.put(words[i], p[i]);
            ch2str.put(p[i], words[i]);
        }
        return true;
    }
}
// @lc code=end

