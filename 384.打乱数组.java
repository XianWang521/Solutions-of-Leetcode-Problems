import java.util.Random;

/*
 * @lc app=leetcode.cn id=384 lang=java
 *
 * [384] 打乱数组
 */

// @lc code=start
class Solution {
    private int[] shuffle;
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
        this.shuffle = new int[nums.length];
        System.arraycopy(nums, 0, shuffle, 0, nums.length);
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        Random rand = new Random();
        for(int i = 0; i < nums.length; i++){
            int j = i + rand.nextInt(nums.length-i);
            int temp = shuffle[i];
            shuffle[i] = shuffle[j];
            shuffle[j] = temp;
        }
        return shuffle;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
// @lc code=end

