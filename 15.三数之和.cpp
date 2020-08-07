/*
 * @lc app=leetcode.cn id=15 lang=cpp
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> res;
        if(nums.size()<3 || nums[0]>0 || nums[nums.size()-1]<0)
            return res;
        
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int j=i+1, k=nums.size()-1;
            while(j < k){
                int temp=nums[i]+nums[j]+nums[k];
                if(temp == 0){
                    res.push_back({nums[i],nums[j],nums[k]});
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                    j++;
                    k--;
                }
                else if(temp > 0)
                    k--;
                else j++;
            }
        }
        return res;
    }
};
// @lc code=end