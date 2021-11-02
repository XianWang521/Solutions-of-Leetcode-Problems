/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        int mid = (right - left) / 2 + left;
        while(left < right){
            int flag = guess(mid);
            if(flag == 1)
                left = mid + 1;
            else if(flag == -1)
                right = mid;
            else break;
            mid = (right - left) / 2 + left;
        }
        return mid;
    }
}
// @lc code=end

