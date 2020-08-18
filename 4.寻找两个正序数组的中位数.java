import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1 = nums1.length, num2 = nums2.length;
        return (findKth(nums1, nums2, (num1 + num2 + 1) / 2) + findKth(nums1, nums2, (num1 + num2 + 2) / 2)) * 1.0 / 2;
    }

    double findKth(int[] nums1, int[] nums2, int s)
    {
        if (nums1.length==0)
            return nums2[s - 1];
        if (nums2.length==0)
            return nums1[s - 1];
        if (s == 1)
            return Math.min(nums1[0], nums2[0]);
        
        int i = Math.min(nums1.length, s / 2), j = Math.min(nums2.length, s / 2);
        if (nums1[i - 1] > nums2[j - 1])
            return findKth(nums1, Arrays.copyOfRange(nums2, j, nums2.length), s - j);
        else
            return findKth(Arrays.copyOfRange(nums1, i, nums1.length), nums2, s - i);
    }
}
// @lc code=end

