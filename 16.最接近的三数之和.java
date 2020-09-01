import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length<3 || nums.length>1000)
            return 0;
        int res=nums[0]+nums[1]+nums[nums.length-1];

        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1, k=nums.length-1;
            while(j<k){
                int temp=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-temp)<Math.abs(target-res)){
                    res=temp;
                }
                if(temp==target) return res;
                else if(temp>target) k--;
                else j++;
            }   
        }
        return res;
    }
}
// @lc code=end

