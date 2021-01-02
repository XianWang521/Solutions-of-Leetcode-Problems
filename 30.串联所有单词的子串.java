import java.util.ArrayList;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

/*
 * @lc app=leetcode.cn id=30 lang=java
 *
 * [30] 串联所有单词的子串
 */

// @lc code=start
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        int num = words.length, len = words[0].length();
        HashMap<String, Integer> all = new HashMap<String, Integer>();
        if(num == 0) return res;

        for(int i = 0; i < num; i++){
            int frequency = all.getOrDefault(words[i], 0);
            all.put(words[i], frequency+1);
        }

        for(int i = 0; i < s.length() - len * num + 1; i++){
            HashMap<String,Integer> exist = new HashMap<String, Integer>();
            int wordnum = 0;
            while(wordnum < num){
                String word = s.substring(i+wordnum*len, i+(wordnum+1)*len);
                if(all.containsKey(word)){
                    int frequency = exist.getOrDefault(word, 0);
                    if(all.get(word) == frequency) break;
                    exist.put(word, frequency+1);
                }
                else break;
                wordnum++;
            }
            if(wordnum == num) res.add(i);
        }
        return res;
    }
}
// @lc code=end

