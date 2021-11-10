import java.util.HashMap;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int key: map.keySet()){
            queue.add(key);
            if(queue.size() > k) queue.poll();
        }

        int[] res = new int[k];
        int count = 0;
        while(!queue.isEmpty()) res[count++] = queue.poll();
        return res;
    }
}
// @lc code=end

