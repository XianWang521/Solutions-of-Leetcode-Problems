/*
 * @lc app=leetcode.cn id=385 lang=java
 *
 * [385] 迷你语法分析器
 */

// @lc code=start
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
// Refer from others
class Solution {
    public NestedInteger deserialize(String s) {
        if(s.length() == 0) return new NestedInteger();
        else if(s.charAt(0) != '[') return new NestedInteger(Integer.valueOf(s));
        else if(s.length() == 2) return new NestedInteger();

        NestedInteger res = new NestedInteger();
        int cur = 1, count = 0;

        for(int i = 1; i < s.length(); i++){
            if(count == 0 && (s.charAt(i) == ',' || i == s.length() - 1)){
                res.add(deserialize(s.substring(cur, i)));
                cur = i + 1;
            }
            else if(s.charAt(i) == '[') count++;
            else if(s.charAt(i) == ']') count--;
        }
        return res;
    }
}
// @lc code=end

