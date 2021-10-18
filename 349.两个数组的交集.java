import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++)
            set.add(nums1[i]);
        
        for(int i = 0; i < nums2.length; i++)
            if(set.contains(nums2[i])) temp.add(nums2[i]);
        
        int[] res = new int[temp.size()];
        int count = 0;
        for(int i : temp) res[count++] = i;
        return res;
    }
}
// @lc code=end

