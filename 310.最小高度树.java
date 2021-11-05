import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=310 lang=java
 *
 * [310] 最小高度树
 */

// @lc code=start
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if(n == 1){
            res.add(0);
            return res;
        }

        int[] degrees = new int[n];
        HashMap<Integer, List<Integer>> edgeinfo = new HashMap<>();
        for(int i = 0; i < n; i++) edgeinfo.put(i, new ArrayList<>());
        for(int[] temp: edges){
            edgeinfo.get(temp[0]).add(temp[1]);
            edgeinfo.get(temp[1]).add(temp[0]);
            degrees[temp[0]]++;
            degrees[temp[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++)
            if(degrees[i] == 1) q.add(i);
        
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int num = q.size();
            for(int i = 0; i < num; i++){
                int cur = q.poll();
                temp.add(cur);
                for(int e: edgeinfo.get(cur))
                    if(--degrees[e] == 1) q.add(e);
            }
            res = temp;
        }
        return res;
    }
}
// @lc code=end

