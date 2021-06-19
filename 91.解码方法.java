/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        char[] ss = s.toCharArray();
		int[] count = new int[ss.length + 1];

		if(ss[0] == '0') return 0;
		else count[0] = 1;

		for(int i = 1; i < ss.length; i++){
			int a = ss[i] - '0';
			int b = (ss[i-1] - '0') * 10 + a;
			if(a > 0 && a < 10) count[i] = count[i-1];
			if(b > 9 && b < 27)
				if(i == 1) count[i] += 1;
				else count[i] += count[i-2];
		}
		return count[ss.length-1];
    }
}
// @lc code=end

