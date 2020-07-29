/*
 * @lc app=leetcode.cn id=1 lang=cpp
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> key;
        for(int i=0;i<nums.size();i++)
        {
            if(key.find(target-nums[i]) != key.end())
                return {key[target-nums[i]],i};
            key[nums[i]] = i;
        }
        return {};
    }
};
// @lc code=end

