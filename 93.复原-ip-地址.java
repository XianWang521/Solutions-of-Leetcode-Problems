import java.awt.List;

/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        dfs(s, 0, res, temp);
        return res;
    }
    private void dfs(String s, int start, List<String> res, List<String> temp){
        // One IP have four segments
        // Each character in string s should be fully used
        if(temp.size() > 4 || (temp.size() == 4 && start != s.length())) return;
        if(temp.size() == 4){
            res.add(String.join(".", temp));
            return;
        }

        for(int i = start; i < s.length(); i++){
            // The value of IP segment from 0 to 255
            // Thus, length of value is from 0 to 3
            // '0xx' or '0x' is illegal
            if(i - start > 2) return;
            String subs = s.substring(start, i+1);
            if(subs.charAt(0) == '0' && subs.length() > 1) return;
            
            int val = Integer.valueOf(subs);
            if(val < 0 || val > 255) continue;
            
            temp.add(subs);
            dfs(s, i+1, res, temp);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

