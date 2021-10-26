import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=316 lang=java
 *
 * [316] 去除重复字母
 */

// @lc code=start
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] exist = new boolean[26];
        LinkedList<Character> stack = new LinkedList<>();

        for(int i = 0; i < s.length(); i++) count[s.charAt(i) - 'a']++;
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            int index = temp - 'a';

            count[index]--;
            if(exist[index]) continue;
            else{
                while(!stack.isEmpty() && stack.peek() > temp && count[stack.peek() - 'a'] > 0)
                    exist[stack.pop() - 'a'] = false;
                stack.push(temp);
                exist[index] = true;
            }
        }

        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) res.append(stack.pop());
        return res.reverse().toString();
    }
}
// @lc code=end

