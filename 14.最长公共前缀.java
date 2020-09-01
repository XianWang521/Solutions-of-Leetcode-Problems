import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if(strs.length==0) return "";
        String a=strs[0],b=strs[strs.length-1];
        StringBuilder re=new StringBuilder();
        int i=0;
        while(i<a.length() && i<b.length() && a.charAt(i)==b.charAt(i))
            re.append(a.charAt(i++));
        return re.toString();
    }
}
// @lc code=end

