import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode.cn id=187 lang=java
 *
 * [187] 重复的DNA序列
 */

// @lc code=start
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> depot = new HashSet<>();
        List<String> res = new ArrayList<>();

        for(int i = 0; i < s.length() - 10 + 1; i++){
            String temp = s.substring(i, i+10);
            if(depot.contains(temp) && !res.contains(temp)) res.add(temp);
            else depot.add(temp);
        }
        return res;
    }
}
// @lc code=end

