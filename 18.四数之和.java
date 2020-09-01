import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length<4)
            return res;
        
        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int l=i+1;l<nums.length-2;l++){
                if(l>i+1 && nums[l]==nums[l-1]) continue;
                int j=l+1, k=nums.length-1;
                while(j < k){
                    int temp=nums[i]+nums[l]+nums[j]+nums[k];
                    if(temp == target){
                        List<Integer> templist = Arrays.asList(nums[i],nums[l],nums[j],nums[k]);
                        res.add(templist);
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
}
// @lc code=end

