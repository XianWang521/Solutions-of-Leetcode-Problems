/*
 * @lc app=leetcode.cn id=299 lang=java
 *
 * [299] 猜数字游戏
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        int[] nums = new int[10];
        int a = 0, b = 0;

        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                a++;
                continue;
            }
            if(nums[secret.charAt(i) - '0']++ < 0) b++;
            if(nums[guess.charAt(i) - '0']-- > 0) b++;
        }
        return a+"A"+b+"B";
    }
}
// @lc code=end

