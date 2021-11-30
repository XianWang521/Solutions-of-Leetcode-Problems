import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=373 lang=java
 *
 * [373] 查找和最小的K对数字
 */

// @lc code=start
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(
            k, (o1, o2)->{return o2.get(0) + o2.get(1) - o1.get(0) - o1.get(1);}
        );

        for(int i = 0; i < Math.min(nums1.length, k); i++){
            for(int j = 0; j < Math.min(nums2.length, k); j++){
                if(queue.size() < k){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums1[i]);
                    temp.add(nums2[j]);
                    queue.add(temp);
                }
                else{
                    int cur = queue.peek().get(0) + queue.peek().get(1);
                    if(cur > nums1[i] + nums2[j]){
                        queue.poll();
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums1[i]);
                        temp.add(nums2[j]);
                        queue.add(temp);
                    }
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while(!queue.isEmpty() && i < k){
            res.add(0, queue.poll());
            i++;
        }
        return res;
    }
}
// @lc code=end

