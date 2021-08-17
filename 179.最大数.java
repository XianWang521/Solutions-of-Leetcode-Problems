import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=179 lang=java
 *
 * [179] 最大数
 */

// @lc code=start
class Solution {
    public String largestNumber(int[] nums) {
        String[] temp = new String[nums.length];
        for(int i = 0; i < temp.length; i++)
            temp[i] = String.valueOf(nums[i]);
        Arrays.sort(temp, (a, b) -> {return (b+a).compareTo(a+b);});
        StringBuilder res = new StringBuilder();
        if(temp[0].equals("0")) return String.valueOf(0);
        for(int i = 0; i < temp.length; i++)
            res.append(temp[i]);
        return res.toString();
    }
}
// @lc code=end

