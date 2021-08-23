import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
// Using HashMap
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> st = new HashMap<Character, Character>();
        Map<Character, Character> ts = new HashMap<Character, Character>();
        
        for(int i = 0; i < s.length(); i++){
            char stemp = s.charAt(i), ttemp = t.charAt(i);
            if((st.containsKey(stemp) && st.get(stemp) != ttemp) || (ts.containsKey(ttemp) && ts.get(ttemp) != stemp))
                return false;
            else{
                st.put(stemp, ttemp);
                ts.put(ttemp, stemp);
            }
        }
        return true;
    }
}
/* Using index as judging method rather than HashMap
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++)
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) return false;
        return true;
    }
}
*/
// @lc code=end

