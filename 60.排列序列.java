import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=60 lang=java
 *
 * [60] 排列序列
 */

// @lc code=start
class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder res = new StringBuilder();
        List<Integer> nums = new ArrayList<Integer>();
        int num = 1;
        for(int i = 1; i <= n; i++){
            nums.add(i);
            num *= i;
        }

        int len = n;
        while(res.length() < n){
            num /= len;
            int temp;
            if(k % num == 0) temp = k / num - 1;
            else temp = k / num;
            res.append(String.valueOf(nums.remove(temp)));
            len--;
            k -= temp * num;
        }
        return res.toString();
    }
}
// @lc code=end

