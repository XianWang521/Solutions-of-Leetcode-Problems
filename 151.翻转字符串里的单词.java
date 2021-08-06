import java.util.Arrays;
import java.util.Collection;

/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 翻转字符串里的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> temp = Arrays.asList(s.split("\\s+"));
        Collections.reverse(temp);
        return String.join(" ", temp);
    }
}
// @lc code=end

