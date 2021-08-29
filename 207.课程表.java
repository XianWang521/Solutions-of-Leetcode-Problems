import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=207 lang=java
 *
 * [207] 课程表
 */

// @lc code=start
// DFS to find loop in the graph
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites){

    }
}

// BFS to find loop in the graph
/*
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges = new ArrayList<>();
        int[] degrees = new int[numCourses];
        Queue<Integer> q = new LinkedList<Integer>();

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
            for(int i : edges.get(temp)){
                degrees[i]--;
                if(degrees[i] == 0) q.add(i);
            }
            numCourses--;
        }
        return numCourses == 0;
    }
}
*/
// @lc code=end

