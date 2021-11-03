/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();

        for(int i = 0; i < m.length; i++) count[m[i] - 'a']++;
        for(int i = 0; i < r.length; i++){
            count[r[i] - 'a']--;
            if(count[r[i] - 'a'] < 0) return false;
        }
        return true;
    }
}
// @lc code=end

