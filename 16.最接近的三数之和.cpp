/*
 * @lc app=leetcode.cn id=16 lang=cpp
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        if(nums.size()<3 || nums.size()>1000)
            return 0;
        int res=nums[0]+nums[1]+nums[nums.size()-1];

        for(int i=0;i<nums.size()-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1, k=nums.size()-1;
            while(j<k){
                int temp=nums[i]+nums[j]+nums[k];
                if(abs(target-temp)<abs(target-res)){
                    res=temp;
                }
                if(temp==target) return res;
                else if(temp>target) k--;
                else j++;
            }   
        }
        return res;
    }
};
// @lc code=end

