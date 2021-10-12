import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
// Refer from official solution
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        
        for(int i = 0; i < nums.length; i++){
            while(!queue.isEmpty() && nums[i] >= nums[queue.getLast()]) queue.removeLast();
            queue.add(i);
            if(queue.getFirst() < i - k + 1) queue.removeFirst();
            if(i + 1 >= k) res[i - k + 1] = nums[queue.getFirst()];
        }
        
        return res;
        /*PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>(){
                public int compare(Integer a, Integer b){
                    return b - a;
                }
            }
        );
        int[] res = new int[nums.length - k + 1];

        for(int i = 0; i < k - 1; i++)
            queue.add(nums[i]);
        
        for(int i = k - 1; i < nums.length; i++){
            queue.add(nums[i]);
            res[i - k + 1] = queue.peek();
            queue.remove(nums[i - k + 1]);
        }
        return res;*/
    }
}
// @lc code=end

