import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=274 lang=java
 *
 * [274] H 指数
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0, index = citations.length - 1;
        while(index >= 0 && citations[index] > h){
            index--;
            h++;
        }
        return h;
    }
}
// @lc code=end

