/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
    	StringBuilder res = new StringBuilder();
    	if(num1.equals("0") || num2.equals("0")) return "0";
    	
    	int len1 = num1.length(), len2 = num2.length();
    	int[] ans = new int[len1 + len2];
        
    	for(int i = len1 - 1; i >= 0; i--) {
    		int v1 = num1.charAt(i) - '0';
    		for(int j = len2 - 1; j >= 0; j--) {
    			int v2 = num2.charAt(j) - '0';
    			int temp = ans[i+j+1] + v1 * v2;
    			ans[i+j+1] = temp % 10;
    			ans[i+j] += temp / 10;
    		}
    	}
    	
    	int start = 0;
    	if(ans[0] == 0) start = 1;
    	while(start != len1 + len2) {
    		res.append(ans[start++]);	
    	}
    	return res.toString();
    }
}
// @lc code=end

