import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int temp = 0;
            while(n > 0){
                temp += (n%10) * (n%10);
                n /= 10;
            }
            n = temp;
        }
        return n == 1;
    }
}
// @lc code=end

