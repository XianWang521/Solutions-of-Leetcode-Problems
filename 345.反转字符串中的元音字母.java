import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<Character>(){{
            add('a'); add('e'); add('i'); add('o'); add('u');
            add('A'); add('E'); add('I'); add('O'); add('U');
        }};
        char[] ss = s.toCharArray();
        int left = 0, right = ss.length - 1;

        while(left < right){
            while(left < ss.length - 1 && !set.contains(ss[left])) left++;
            while(right > 0 && !set.contains(ss[right])) right--;
            if(left < right){
                char temp = ss[left];
                ss[left++] = ss[right];
                ss[right--] = temp;
            }
        }
        return new String(ss);
    }
}
// @lc code=end

