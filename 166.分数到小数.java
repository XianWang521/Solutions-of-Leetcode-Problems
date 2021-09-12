import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=166 lang=java
 *
 * [166] 分数到小数
 */

// @lc code=start
// Refer from official solution
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder res = new StringBuilder();

        if(numerator < 0 ^ denominator < 0) res.append('-');
        long num = Math.abs(Long.valueOf(numerator));
        long den = Math.abs(Long.valueOf(denominator));

        res.append(String.valueOf(num / den));
        long remain = num % den;
        if(remain == 0) return res.toString();
        else res.append('.');


        Map<Long, Integer> map = new HashMap<>();
        while(remain != 0){
            if(map.containsKey(remain)){
                res.insert(map.get(remain), "(");
                res.append(")");
                break;
            }
            map.put(remain, res.length());
            res.append(String.valueOf(remain * 10/ den));
            remain = (remain * 10) % den;
        }
        return res.toString();
    }
}
// @lc code=end

