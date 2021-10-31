/*
 * @lc app=leetcode.cn id=318 lang=java
 *
 * [318] 最大单词长度乘积
 */

// @lc code=start

class Solution {
    public int maxProduct(String[] words) {
        int res = 0;
        
        for(int i = 0; i < words.length; i++)
            for(int j = i + 1; j < words.length; j++)
                if(check(words[i], words[j])) res = Math.max(res, words[i].length() * words[j].length());  
        return res;
    }

    private boolean check(String a, String b){
        char[] temp = a.toCharArray();
        for(char i : temp)
            if(b.indexOf(i) != -1) return false;
        return true;
    }
}
// @lc code=end

