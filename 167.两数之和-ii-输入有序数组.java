/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        int temp;
        while(left < right){
            temp = numbers[left] + numbers[right];
            if(temp > target) right--;
            else if(temp < target) left++;
            else return new int[]{left+1, right+1};
        }
        return new int[]{-1, -1};
    }
}
// @lc code=end

