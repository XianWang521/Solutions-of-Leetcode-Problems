/*
 * @lc app=leetcode.cn id=275 lang=java
 *
 * [275] H 指数 II
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        int left = 0, right = citations.length - 1;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            if(citations[mid] >= citations.length - mid) right = mid - 1;
            else left = mid + 1;
        }
        return citations.length - left;
    }
}
// @lc code=end

