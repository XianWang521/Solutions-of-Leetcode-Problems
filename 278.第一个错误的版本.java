/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1) return 1;
        int left = 1, right = n;
        
        while(left < right){
            int mid = (right - left) / 2 + left;
            if(isBadVersion(mid)) right = mid;
            else left = mid + 1; 
        }
        return left;
    }
}
// @lc code=end

