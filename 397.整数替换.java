import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=397 lang=java
 *
 * [397] 整数替换
 */

// @lc code=start
class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int integerReplacement(int n) {
        if(n == 1) return 0;
        if(!map.containsKey(n)){
            if(n % 2 == 0) map.put(n, 1+integerReplacement(n/2));
            else map.put(n, 2+Math.min(integerReplacement(n/2+1), integerReplacement(n/2)));
        }
        return map.get(n);
    }
}
// @lc code=end

