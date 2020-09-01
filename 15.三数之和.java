import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length<3 || nums[0]>0 || nums[nums.length-1]<0)
            return res;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int j=i+1, k=nums.length-1;
            while(j < k){
                int temp=nums[i]+nums[j]+nums[k];
                if(temp == 0){
                    List<Integer> templist = Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(templist);
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
}
// @lc code=end

