/*
 * @lc app=leetcode.cn id=307 lang=java
 *
 * [307] 区域和检索 - 数组可修改
 */

// @lc code=start
// Refer official solution
class NumArray{
    private int[] tree;
    int n;

    public NumArray(int[] nums){
        if(nums.length > 0){
            n = nums.length;
            tree = new int[n * 2];
            for(int i = n, j = 0; i < 2 * n; i++, j++)
                tree[i] = nums[j];
            for(int i = n - 1; i > 0; i--)
                tree[i] = tree[i * 2] + tree[2 * i + 1];
        }
    }

    public void update(int index, int val){
        int pos = index + n;
        tree[pos] = val;
        while(pos > 0){
            int left = pos%2 == 0? pos: pos-1;
            int right = pos%2 == 0? pos+1: pos;
            tree[pos/2] = tree[left] + tree[right];
            pos /= 2;
        }
    }

    public int sumRange(int left, int right){
        int sum = 0, l = n + left, r = n + right;
        while(r >= l){
            if(l % 2 == 1){
                sum += tree[l];
                l++;
            }
            if(r % 2 == 0){
                sum += tree[r];
                r--;
            }
            l /= 2;
            r /= 2;
        }
        return sum;
    }
}
// Prefix sum
// Time limit exceeded
/*
class NumArray {
    private int[] sums;
    private int[] nums;

    public NumArray(int[] nums) {
        sums = new int[nums.length+1];
        this.nums = new int[nums.length];
        sums[0] = 0;
        
        for(int i = 1; i <= nums.length; i++){
            sums[i] += sums[i-1] + nums[i-1];
            this.nums[i-1] = nums[i-1];
        }
    }
    
    public void update(int index, int val) {
        int temp = val - this.nums[index];
        this.nums[index] = val;
        for(int i = index + 1; i < sums.length; i++)
            sums[i] += temp;
    }
    
    public int sumRange(int left, int right) {
        return sums[right+1]-sums[left];
    }
}
*/
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
// @lc code=end

