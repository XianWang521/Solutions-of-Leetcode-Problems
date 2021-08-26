import java.util.List;

/*
 * @lc app=leetcode.cn id=228 lang=java
 *
 * [228] 汇总区间
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        int i = 0;
        
        while(i < nums.length){
            int left = i++;
            
            while(i < nums.length && nums[i] == nums[i-1] + 1)
                i++;
            
            int right = i - 1;
            StringBuilder temp = new StringBuilder();
            
            if(left == right) temp.append(Integer.toString(nums[left]));
            else temp.append(Integer.toString(nums[left]) + "->" + Integer.toString(nums[right]));
            res.add(temp.toString());
        }
        return res;
    }
}
// @lc code=end

