import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=264 lang=java
 *
 * [264] 丑数 II
 */

// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {
        int[] divided = new int[]{2, 3, 5};
        Set<Long> set = new HashSet<>();
        Queue<Long> p = new PriorityQueue<>();
        set.add((long)1);
        p.add((long)1);
        long temp = (long)1;
        for(int i = 0; i < n; i++){
            temp = p.poll();
            for(int j : divided){
                long s = j * temp;
                if(!set.contains(s)){
                    set.add(s);
                    p.add(s);
                }
            }
        }
        return (int)temp;
    }
}
// @lc code=end

