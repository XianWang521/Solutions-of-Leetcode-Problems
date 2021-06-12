/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
    	Stack<String> temp = new Stack<String>();
    	String[] s = path.split("/");
    	StringBuilder res = new StringBuilder();
    	for(int i = 0; i < s.length; i++) {
    		if(s[i].isEmpty() || s[i].equals(".")) continue;
    		if(s[i].equals("..")) { 
    			if(temp.isEmpty())
    				continue;
    			else
    				temp.pop();
    		}
    		else
    			temp.push(s[i]);
    	}
        if(temp.isEmpty()) return "/";
    	while(!temp.isEmpty()) {
    		res.insert(0, temp.pop());
    		res.insert(0, "/");
    	}
    	return res.toString();
    }
}
// @lc code=end

