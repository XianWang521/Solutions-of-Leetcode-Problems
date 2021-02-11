import jdk.internal.jshell.tool.resources.l10n;

/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        StringBuilder res = new StringBuilder();
        String temp = countAndSay(n-1);
        int count = 0;
        char num = temp.charAt(0);
        
        for(int i = 0;i < temp.length();i++){
            if(temp.charAt(i) == num) count++;
            else{
                res.append(count).append(num);
                count = 1;
                num = temp.charAt(i);
            }
        }
        return res.append(count).append(num).toString();
    }
}
// @lc code=end

