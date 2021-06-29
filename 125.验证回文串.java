/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r){
            while(!Character.isLetterOrDigit(s.charAt(l)) && l < r) l++;
            while(!Character.isLetterOrDigit(s.charAt(r)) && l < r) r--;
            if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))){
                l++;
                r--;
            }
            else return false;
        }
        return true;
    }
}
// @lc code=end

