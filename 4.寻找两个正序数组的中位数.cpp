/*
 * @lc app=leetcode.cn id=4 lang=cpp
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
public:
    double findMedianSortedArrays(vector<int> &nums1, vector<int> &nums2)
    {
        int num1 = nums1.size(), num2 = nums2.size();
        return (findKth(nums1, nums2, (num1 + num2 + 1) / 2) + findKth(nums1, nums2, (num1 + num2 + 2) / 2)) * 1.0 / 2;
    }

    double findKth(vector<int> nums1, vector<int> nums2, int s)
    {
        if (nums1.empty())
            return nums2[s - 1];
        if (nums2.empty())
            return nums1[s - 1];
        if (s == 1)
            return min(nums1[0], nums2[0]);
        
        int i = min((int)nums1.size(), s / 2), j = min((int)nums2.size(), s / 2);
        if (nums1[i - 1] > nums2[j - 1])
            return findKth(nums1, vector<int>(nums2.begin() + j, nums2.end()), s - j);
        else
            return findKth(vector<int>(nums1.begin() + i, nums1.end()), nums2, s - i);
        return 0;
    }
};
// @lc code=end

