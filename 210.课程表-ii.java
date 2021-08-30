import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=210 lang=java
 *
 * [210] 课程表 II
 */

// @lc code=start
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges = new ArrayList<>();
        int[] degrees = new int[numCourses];
        Queue<Integer> q = new LinkedList<Integer>();
        int[] res = new int[numCourses];
        int index = 0;

        for(int i = 0; i < numCourses; i++)
            edges.add(new ArrayList<Integer>());
        
        // Get in degree of nodes
        for(int[] temp : prerequisites){
            degrees[temp[0]]++;
            edges.get(temp[1]).add(temp[0]);
        }
        
        for(int i = 0; i < numCourses; i++)
            if(degrees[i] == 0) q.add(i);
        
        while(!q.isEmpty()){
            int temp = q.poll();
            res[index++] = temp;
            for(int i : edges.get(temp)){
                degrees[i]--;
                if(degrees[i] == 0) q.add(i);
            }
            numCourses--;
        }
        if(numCourses != 0) return new int[0];
        return res;
    }
}
// @lc code=end

