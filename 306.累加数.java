/*
 * @lc app=leetcode.cn id=306 lang=java
 *
 * [306] 累加数
 */

// @lc code=start
// Refer from other people
class Solution {
    public boolean isAdditiveNumber(String num) {
        if(num.length() < 3) return false;
        for(int i = 1; i <= num.length() / 2; i++){
            long num1 = Long.parseLong(num.substring(0, i));
            if(String.valueOf(num1).length() != i) continue;
            for(int j = i + 1; j <= (num.length() - i) / 2 + i; j++){
                long num2 = Long.parseLong(num.substring(i, j));
                if(String.valueOf(num2).length() != j - i) continue;
                if(isAdditive(num, num1, num2, j)) return true;
            }
        }
        return false;
    }

    private boolean isAdditive(String num, long num1, long num2, int index){
        if(index == num.length()) return true;
        long sum = num1 + num2;
        String temp = String.valueOf(sum);
        if(num.indexOf(temp, index) != index) return false;
        return isAdditive(num, num2, sum, index + temp.length());
    }
}
// @lc code=end

