import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i = 0; i < strs.length; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);
            List<String> l = map.getOrDefault(key, new ArrayList<String>());
            l.add(strs[i]);
            map.put(key, l);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
// @lc code=end

