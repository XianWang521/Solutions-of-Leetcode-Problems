/*
 * @lc app=leetcode.cn id=18 lang=cpp
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> res;
        if(nums.size()<4)
            return res;
        
        for(int i=0;i<nums.size()-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int l=i+1;l<nums.size()-2;l++){
                if(l>i+1 && nums[l]==nums[l-1]) continue;
                int j=l+1, k=nums.size()-1;
                while(j < k){
                    int temp=nums[i]+nums[l]+nums[j]+nums[k];
                    if(temp == target){
                        res.push_back({nums[i],nums[l],nums[j],nums[k]});
                        while(j<k && nums[j]==nums[j+1]) j++;
                        while(j<k && nums[k]==nums[k-1]) k--;
                        j++;
                        k--;
                    }
                    else if(temp > target)
                        k--;
                    else j++;
                }
            }
        }
        return res;
    }
};
// @lc code=end

