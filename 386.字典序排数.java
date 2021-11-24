import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=386 lang=java
 *
 * [386] 字典序排数
 */

// @lc code=start
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        int temp = 1;

        while(res.size() < n){
            while(temp <= n){
                res.add(temp);
                temp *= 10;
            }
            while(temp > n || temp % 10 == 9)
                temp /= 10;
            
            temp++;
        }
        return res;
    }
}
// @lc code=end

