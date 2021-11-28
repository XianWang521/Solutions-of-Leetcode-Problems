/*
 * @lc app=leetcode.cn id=395 lang=java
 *
 * [395] 至少有 K 个重复字符的最长子串
 */

// @lc code=start
// Refer from official solution
// Divide and Conquer
class Solution {
    public int longestSubstring(String s, int k) {
        return dfs(s, k, 0, s.length()-1);
    }

    private int dfs(String s, int k, int l, int r){
        int[] count = new int[26];
        for(int i = l; i <= r; i++) count[s.charAt(i) - 'a']++;

        char split = 0;
        for(int i = 0; i < 26; i++){
            if(count[i] > 0 && count[i] < k){
                split = (char) (i + 'a');
                break;
            }
        }
        if(split == 0) return r - l + 1;

        int res = 0;
        while(l <= r){
            // Find the start
            while(l <= r && s.charAt(l) == split) l++;
            if(l > r) break;
            int start = l;

            // Find the end
            while(l <= r && s.charAt(l) != split) l++;

            int len = dfs(s, k, start, l - 1);
            res = Math.max(res, len);
        }
        return res;
    }
}
// @lc code=end

